import java.util.ArrayList;

public class Chance extends MonopolySquare {

    private ChanceDeck cd;
    ChanceCard c;

    Chance(String name, ChanceDeck cd ) {
        super(name);
        this.cd = cd;
    }

    public void landOn(Player P){
            printMessage(P);
            while (true) {
                c = cd.remove();
                try {
                    c.action(P);
                    break;
                }
                catch (DrawNewCardException d) {
                }
            }
        }

    @Override
    public void printMessage(Player P) {
        System.out.println(P.getName() +" landed on " + name );
    }
}
