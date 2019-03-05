
// If you land on it you get all the loose change money
// Or you have to give to Loose Change if Firework, water show, and go to rest room.

public class LooseChange extends MonopolySquare {


	private int balanceLC;

	public LooseChange(String name) {
		super(name);
		this.balanceLC = balanceLC;
	}

	public void printMessage(Player P) {
		System.out.println(P.getName() + " landed on LooseChange");
		System.out.println(P.getName() + " gets $" + balanceLC + " from LooseChange");

	}

	public void resetBalance() {
		balanceLC = 0;
	}

	public void landOn(Player P) throws BankruptException {
		printMessage(P);
		P.addBankBalance(balanceLC);
		System.out.println("You gained $" + balanceLC +". Your new Balance: " + P.getBankBalance()+ "\n");
		resetBalance();

	}

	public void addBalance(int value) {
		balanceLC = balanceLC + value;
	}
}

