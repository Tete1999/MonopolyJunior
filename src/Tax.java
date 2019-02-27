
// If you add on Tax Square we subtract money and add to Loose Change Pile.

public class Tax extends MonopolySquare
{
    protected int tax;
    private LooseChange lc;


    public Tax(String name, LooseChange lc, int tax)
    {
        this.tax = tax;
        this.lc = lc;
    }

    public void printMessage(Player P){
        System.out.println(P.getName() + "landed on " + name);
        System.out.println(P.getName() + " has to pay " + tax + " in taxes.");
        P.getBankBalance();
    }

    public void landOn(Player P) throws BankruptException{

        P.moneyFlow(tax * -1);  // subtract tax from player
        if (P.isBankrupt())
        {
            throw new BankruptException(P.getName() + "ran out of money !");
        }
        else {
            printMessage(P);
            lc.addBalance(tax);
        }
    }

}
