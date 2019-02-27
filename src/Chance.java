import java.util.Random;

public class Chance extends MonopolySquare
{


    ChanceDeck deck = new ChanceDeck();


    Chance(String name)
    {
        super(name);
    }



    public int randNum(int deckSize)     // bound will be deck size
    {
        Random r = new Random();
        return r.nextInt(deckSize);
    }

    public int randLoc()
    {
        Random r = new Random();
        return r.nextInt(32); // num between 0 and 31
    }


    public void printMessage(Player P)
    {

        System.out.println(P.getName() + "landed on ");
        landOn(P);


    }


    public void landOn(Player P)

    {
        if (deck.getDeckLenghth() == 0)
        {
            deck = new ChanceDeck();  // Repopulate the Deck Card
        }

        boolean check = deck.removeCard(randNum(deck.getDeckLenghth()));  // Prints card removed
        if (check == true) {                //Specific Card
            P.setLocation(randLoc());
        }
        else
        {
            P.t

        }

    }



}
