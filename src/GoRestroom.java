public class GoRestroom extends Tax
{

    public GoRestroom(String name, LooseChange lc, int tax)
    {
        super(name, lc, tax);  // essentially creates a tax square

    }

    public void landOn(Player P) throws BankruptException {
        super.landOn(P);  // what happens if we land on that tax square
        P.setLocationGoRestroom(10);
        P.setTurn(false);

    }

    public void printMessage(Player P)
    {

        System.out.println(P.getName() + " landed on GoRestroom and pays $" + tax +  " in rent");
        System.out.println(P.getName() + " is taken to Restroom.");
    }
}



