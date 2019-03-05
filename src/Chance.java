import java.util.ArrayList;

public class Chance extends MonopolySquare
{
    ChanceDeck cd = new ChanceDeck();
    ArrayList<ChanceCard> d1;
    ChanceCard c;
    Properties prop;

    Chance(String name)
    {
        super(name);
    }

    @Override
    public void landOn(Player P) throws BankruptException {
        d1 = cd.getDeck();         // Whole Shuffled deck of chance cards
        c = d1.remove(0);   // Card popped at index 0
        printMessage(P);

        if (c.getType() == "GT") {
            System.out.println("Go To: " + c.getAction() + "\n");
            P.setLocation(c.getGoLocation());
        } else {
            System.out.println("Free Ticket Booth: " + c.getAction() + "\n");
            P.setLocation(c.getGoLocation());
        }
    }

    @Override
    public void printMessage(Player P) {
        System.out.println(P.getName() + " landed on the Chance Square.");

    }
}