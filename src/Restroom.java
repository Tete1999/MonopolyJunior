public class Restroom extends MonopolySquare
{
    public Restroom(String name){
        super(name);
    }

    public void landOn(Player P) throws BankruptException
    {
        printMessage(P);
    }
    public void printMessage(Player P)
    {
        System.out.println(P.getName() + "landed on Restroom");
    }
}


