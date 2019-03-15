public abstract class MonopolySquare {

	protected String name;

	public MonopolySquare(String n) {
		name = n;
	}


	public abstract void landOn(Player P) throws BankruptException;


	public abstract void printMessage(Player P);

}
