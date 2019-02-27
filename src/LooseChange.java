
// If you land on it you get all the loose change money
// Or you have to give to Loose Change if Firework, water show, and go to rest room.
// So this is basically Tax Square

public class LooseChange extends MonopolySquare {


	private int balance;

	public LooseChange(String name) {
		super(name);
		balance = 0;
	}

	public void printMessage(Player P) {
		System.out.println(P.getName() + " landed on LooseChange");
		System.out.println(P.getName() + "gets " + balance + "from LooseChange");
		P.getBankBalance();

	}

	public void resetBalance() {
		balance = 0;
	}

	public void landOn(Player P) throws BankruptException {
		P.moneyFlow(balance);
		printMessage(P);
		resetBalance();
	}

	public void addBalance(int value) {
		balance = balance + value;
	}
}