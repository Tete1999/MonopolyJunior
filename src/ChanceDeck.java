import java.util.ArrayList;
import java.util.Collections;

public class ChanceDeck {

    private Board b;
    private ArrayList<ChanceCard> deck = new ArrayList<ChanceCard>();
    private ArrayList<ChanceCard> deckControl;
    private ArrayList<MonopolySquare> propertyListChance;


    ChanceDeck(Board b){
        this.b = b;
        propertyListChance = b.getPropertyList();

        ChanceCard c1 = new GoTo("Go To Purple1", 2, (Properties) propertyListChance.get(2));
        ChanceCard c2 = new GoTo("Go To Purple2", 3, (Properties) propertyListChance.get(3));
        ChanceCard c3 = new GoTo("Go To White1", 6, (Properties) propertyListChance.get(6));
        ChanceCard c4 = new GoTo("Go To White2", 7, (Properties) propertyListChance.get(7));
        ChanceCard c5 = new GoTo("Go To Magenta1", 11,(Properties) propertyListChance.get(11));
        ChanceCard c6 = new GoTo("Go To Magenta2", 12, (Properties) propertyListChance.get(12));
        ChanceCard c7 = new GoTo("Go To Orange1", 14, (Properties) propertyListChance.get(14));
        ChanceCard c8 = new GoTo("Go To Orange2", 15, (Properties) propertyListChance.get(15));
        ChanceCard c9 = new GoTo("Go To Red1", 18, (Properties) propertyListChance.get(18));
        ChanceCard c10 = new GoTo("Go To Red2", 19, (Properties) propertyListChance.get(19));
        ChanceCard c11 = new GoTo("Go To Yellow1", 22, (Properties) propertyListChance.get(22));
        ChanceCard c12 = new GoTo("Go To Yellow2", 23, (Properties) propertyListChance.get(23));
        ChanceCard c13 = new GoTo("Go To Green1", 27, (Properties) propertyListChance.get(27));
        ChanceCard c14 = new GoTo("Go To Green2", 28, (Properties) propertyListChance.get(28));
        ChanceCard c15 = new GoTo("Go To Blue1", 30, (Properties) propertyListChance.get(30));
        ChanceCard c16 = new GoTo("Go To Blue2", 31, (Properties) propertyListChance.get(31));
        ChanceCard c17 = new FreeTicketBooth("Free Ticket Booth Purple", "Purple", (Properties) propertyListChance.get(2), (Properties) propertyListChance.get(3));
        ChanceCard c18 = new FreeTicketBooth("Free Ticket Booth White ", "White", (Properties) propertyListChance.get(6), (Properties) propertyListChance.get(7));
        ChanceCard c19 = new FreeTicketBooth("Free Ticket Booth Magenta", "Magenta", (Properties) propertyListChance.get(11), (Properties) propertyListChance.get(12));
        ChanceCard c20 = new FreeTicketBooth("Free Ticket Booth Orange", "Orange", (Properties) propertyListChance.get(14), (Properties) propertyListChance.get(15));
        ChanceCard c21 = new FreeTicketBooth("Free Ticket Booth Red", "Red", (Properties) propertyListChance.get(18), (Properties) propertyListChance.get(19));
        ChanceCard c22 = new FreeTicketBooth("Free Ticket Booth Yellow", "Yellow", (Properties) propertyListChance.get(22), (Properties) propertyListChance.get(23));
        ChanceCard c23 = new FreeTicketBooth("Free Ticket Booth Green", "Green", (Properties) propertyListChance.get(27), (Properties) propertyListChance.get(28));
        ChanceCard c24 = new FreeTicketBooth("Free Ticket Booth Blue", "Blue", (Properties) propertyListChance.get(30), (Properties) propertyListChance.get(31));


        deck.add(c1);
        deck.add(c2);
        deck.add(c3);
        deck.add(c4);
        deck.add(c5);
        deck.add(c6);
        deck.add(c7);
        deck.add(c8);
        deck.add(c9);
        deck.add(c10);
        deck.add(c11);
        deck.add(c12);
        deck.add(c13);
        deck.add(c14);
        deck.add(c15);
        deck.add(c16);
        deck.add(c17);
        deck.add(c18);
        deck.add(c19);
        deck.add(c20);
        deck.add(c21);
        deck.add(c22);
        deck.add(c23);
        deck.add(c24);
        deckControl = new ArrayList<ChanceCard>(deck);
        Collections.shuffle(deck);
    }

    private void repopulateDeck(){
        System.out.println("Chance Deck gets repopulated");
        deck = new ArrayList<ChanceCard>(deckControl);
        Collections.shuffle(deck);
    }

    protected ChanceCard remove(){
        ChanceCard poppedCard;
        try{
           poppedCard = deck.remove(0);
       }
        catch (IndexOutOfBoundsException e){
           repopulateDeck();
           poppedCard = deck.remove(0);
       }
        return poppedCard;
    }


}
