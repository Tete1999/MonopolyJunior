public class GoRestroom extends Tax
{

    public GoRestroom(String name, LooseChange lc, int tax)
    {
        super(name, lc, tax);  // essentially creates a tax square

    }

    public void landOn(Player P) throws BankruptException {
        //printMessage(P);
        super.landOn(P);  // what happens if we land on that tax square
        P.setLocation(10);

    }

    public void printMessage(Player P)
    {

        System.out.println(P.getName() + " landed on GoRestroom and pays $" + tax +  " in rent\n");
        System.out.println(P.getName() + " is taken to Restroom.");
    }
}



