public class Go extends MonopolySquare {


    int money = 2;

    public Go(String name)
    {
        super(name);
    }

    public int goMoney()
    {
       return money;
    }
    @Override
    public void landOn(Player P) throws BankruptException {
    }

    public void printMessage(Player P)
    {
        System.out.println(P.getName() + "gets" + goMoney() + "$ by passing or landing Go");
    }
}
