 import java.util.ArrayList;
 import java.util.Random;

public class ChanceDeck {

	protected ArrayList<Integer> deck = new ArrayList<Integer>();

	public ChanceDeck() {

		deck.add(0);      // 0 is specific
		deck.add(0);
		deck.add(1);	 // 1 is freeTicketBooth
	}
		public int getDeckLenghth()
	{
		return deck.size();
	}

	public boolean removeCard(int index)
	{
		System.out.println(deck.get(index));
		deck.remove(index);
	}








}


