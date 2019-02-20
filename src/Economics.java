public class Economics extends MonopolySquare
{
    public int amtOwed;    // Somehow need to attach it to different property weights .

    public Economics(String name)
    {
        super(name);
    }

    @Override
    public void landOn(Player P) throws BankruptException
    {
        int balance = P.getBankAccount() - amtOwed;
        if (balance < 0)
        {
            throw new BankruptException("You are BROKE")
        }
        else
            {
                P.setBankAccount(balance);
            }

    }
}
