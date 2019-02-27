import java.util.Random;

public class MonopolyGame {
	private LooseChange lc;
	private ChanceDeck chanceCardDeck;


	public MonopolyGame(){

	}
	public void play()
	{
		boolean gameEnd = false;
		Player p1 = new Player("Talal");
		Player p2 = new Player("Stephen");
		Board board = new Board();

		while(!gameEnd)
		{
			p1.takeTurn();
			board.youLandedOn(p1.getLocation());
			if (p1.getLocation() == )
		}





	}




}
