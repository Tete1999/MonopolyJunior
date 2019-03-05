
// If you add on Tax Square we subtract money and add to Loose Change Pile.

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
        System.out.println(P.getName() + " has to pay " + tax + " in taxes.");
        System.out.println(P.getName() + " New Balance = " + P.getBankBalance() + "\n");
    }

    public void landOn(Player P) throws BankruptException
    {

        P.addBankBalance(-1*tax);
        printMessage(P);
        if (P.isBankrupt() == true) {
            throw new BankruptException(P.getName()+ " is Bankrupt.");
        }
        lc.addBalance(tax);
    }

}
