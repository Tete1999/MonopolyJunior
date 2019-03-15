public abstract class ChanceCard {

    protected String name;
    public ChanceCard(String n){name = n;}

    public abstract void action(Player P) throws DrawNewCardException;

    public String getName() {
        return name;
    }
}
