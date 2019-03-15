import java.util.ArrayList;

public class MonopolyGame {

	private LooseChange lc;
	private Board b;
	private ChanceDeck cd;
	private Player p1;
	private Player p2;
	private ArrayList<MonopolySquare> board;
	private ArrayList<ChanceCard> deck;


	MonopolyGame() {
		b = new Board();
		cd = new ChanceDeck(b);
		b.setChanceDeck(cd);
		board = b.getPropertyList();

		p1 = new Player("Messi");
		p2 = new Player("Ronaldo");

	}

	public void play () throws BankruptException{
		p1.setTurn(true);
		try {
				while (true) {
					while (p1.getTurn()) {
						p1.move();
						board.get(p1.getLocation()).landOn(p1);
					}
					System.out.println(p2.getName() + "'s turn.");
					p2.setTurn(true);
					while (p2.getTurn()) {
						p2.move();
						board.get(p2.getLocation()).landOn(p2);
						}
						p1.setTurn(true);
						System.out.println(p1.getName() + "'s turn.");
					}
				}
		catch (BankruptException e){
			System.out.println("Game End !!!");
		}
	}
}


