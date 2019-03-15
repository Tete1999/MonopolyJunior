public class Tax extends MonopolySquare
{
    protected int tax;
    private LooseChange lc;




    public Tax(String name, LooseChange lc, int tax)
    {
        super(name);
        this.tax = tax;
        this.lc = lc;
    }

    public void printMessage(Player P){
        System.out.println(P.getName() + " landed on " + name);
        System.out.println(P.getName() + " has to pay $" + tax + " in taxes.");

    }

    public void landOn(Player P) throws BankruptException
    {

        P.addBankBalance(-1*tax);
        printMessage(P);
        if (P.isBankrupt()) {
            System.out.println(P.getName() + " cannot complete this action");
            throw new BankruptException(P.getName()+ " is Bankrupt.");
        }
        System.out.println(P.getName() + " New Balance = " + P.getBankBalance() + "\n");
        lc.addBalance(tax);
        P.setTurn(false);
    }

}
