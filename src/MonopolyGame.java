import java.util.Random;

public class MonopolyGame {
	private MonopolySquare[] board;
	private Random dice;
	private LooseChange lc;
	private ChanceDeck chanceCardDeck;


	public MonopolyGame(){

		p1 = new Player("Talal");
		p2 = new Player("Khan");

	}
	public void play() {
		System.out.println("Playing game");  // remove this.
	}

	public int roll()
	{
		Random r = new Random();
		int dRoll= r.nextInt(6) + 1;
		return dRoll;
	}


}
