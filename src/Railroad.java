public class Railroad extends MonopolySquare {


    public Railroad(String name)
    {
        super(name);
    }


    public void landOn(Player P) throws BankruptException
    {
        printMessage(P);
    }

    public void printMessage(Player P){

        System.out.println("You landed on " + name + ".");
        System.out.println(P.getName() + " gets to roll again.");
    }






}
