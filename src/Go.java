public class Go extends MonopolySquare {

    public Go(String name)
    {
        super(name);
    }


    @Override
    public void landOn(Player P) throws BankruptException {
        printMessage(P);
        P.addBankBalance(2);
        System.out.println(P.getName() + " New Balance = " + P.getBankBalance() + "\n");
    }

    public void printMessage(Player P)
    {
        System.out.println(P.getName() + " gets $2 by  landing Go");

    }
}
