import java.util.ArrayList;

public class MonopolyGame {

	private LooseChange lc;
	Board b;
	Player p1;
	Player p2;
	ArrayList<MonopolySquare> board;


	MonopolyGame() {
		b = new Board();
		board = b.getPropertyList();
		p1 = new Player("Jesus");
		p2 = new Player("Muhammad");
		LooseChange lc;
	}


	public void play () throws BankruptException {

		p1.setTurn(true);

		try {

			while(true) {

				while (p1.getTurn() == true) {
					p1.move();
					if (p1.getLocation() == 5 || p1.getLocation() == 13 || p1.getLocation() == 21 || p1.getLocation() == 29) {
						board.get(p1.getLocation()).landOn(p1);
						board.get(p1.getLocation()).landOn(p1);
					}

					else if (p1.getLocation() == 1 || p1.getLocation() == 4 || p1.getLocation() == 9 || p1.getLocation() == 17 ||
							p1.getLocation() == 20 || p1.getLocation() == 25) {

						board.get(p1.getLocation()).landOn(p1);
						board.get(p1.getLocation()).landOn(p1);
					}

					else {
						board.get(p1.getLocation()).landOn(p1);
					}
					p2.setTurn(true);
					p1.setTurn(false);
					System.out.println(p2.getName() + "'s turn.");
				}

				while (p2.getTurn() == true) {
					p2.move();
					if (p2.getLocation() == 5 || p2.getLocation() == 13 || p2.getLocation() == 21 || p2.getLocation() == 29) {
						board.get(p2.getLocation()).landOn(p2);
						board.get(p2.getLocation()).landOn(p2);
					}

					else if (p2.getLocation() == 1 || p2.getLocation() == 4 || p2.getLocation() == 9 || p2.getLocation() == 17 ||
							p2.getLocation() == 20 || p2.getLocation() == 25) {

						board.get(p2.getLocation()).landOn(p2);
						board.get(p2.getLocation()).landOn(p2);
					}
					else {
						board.get(p2.getLocation()).landOn(p2);
					}
					p1.setTurn(true);
					p2.setTurn(false);
					System.out.println(p1.getName() + "'s turn.");

				}
			}
		}
		catch (BankruptException e){
			System.out.println("Game End !!!");
		}
	}
}


