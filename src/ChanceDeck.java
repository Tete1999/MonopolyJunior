import java.util.ArrayList;
import java.util.Collections;

public class ChanceDeck
{
 private ArrayList<ChanceCard> deck = new java.util.ArrayList<ChanceCard>();

 private ChanceCard c1 = new ChanceCard("GT", "Purple1", 2);
 private ChanceCard c2 = new ChanceCard("GT", "Purple2", 3);

 private ChanceCard c3 = new ChanceCard("GT", "White1", 6);
 private ChanceCard c4 = new ChanceCard("GT", "White2", 7);

 private ChanceCard c5 = new ChanceCard("GT", "Magenta1", 11);
 private ChanceCard c6 = new ChanceCard("GT", "Magenta2", 12);

 private ChanceCard c7 = new ChanceCard("GT", "Orange1", 14);
 private ChanceCard c8 = new ChanceCard("GT", "Orange2", 15);

 private ChanceCard c9 = new ChanceCard("GT", "Red1", 18);
 private ChanceCard c10 = new ChanceCard("GT", "Red2", 19);

 private ChanceCard c11 = new ChanceCard("GT", "Yellow1", 22);
 private ChanceCard c12 = new ChanceCard("GT", "Yellow2", 23);

 private ChanceCard c13 = new ChanceCard("GT", "Green1", 27);
 private ChanceCard c14 = new ChanceCard("GT", "Green2", 28);

 private ChanceCard c15 = new ChanceCard("GT", "Blue1", 30);
 private ChanceCard c16 = new ChanceCard("GT", "Blue2", 31);

 private ChanceCard c17 = new ChanceCard("FTB", "Purple", 2);
 private ChanceCard c18 = new ChanceCard("FTB", "White", 6);
 private ChanceCard c19 = new ChanceCard("FTB", "Magenta", 11);
 private ChanceCard c20 = new ChanceCard("FTB", "Orange", 14);
 private ChanceCard c21 = new ChanceCard("FTB", "Red", 18);
 private ChanceCard c22 = new ChanceCard("FTB", "Yellow", 22);
 private ChanceCard c23 = new ChanceCard("FTB", "Green", 27);
 private ChanceCard c24 = new ChanceCard("FTB", "Blue", 30);


 ChanceDeck()
 {
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
  deck.add(c17);
  deck.add(c18);
  deck.add(c19);
  deck.add(c20);
  deck.add(c21);
  deck.add(c22);
  deck.add(c23);
  deck.add(c24);
  Collections.shuffle(deck);

 }

 public ArrayList<ChanceCard> getDeck() {
  return deck;
 }
}
