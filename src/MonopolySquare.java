public abstract class MonopolySquare {
	protected String name;
	protected int location;

	public MonopolySquare(){}

	public MonopolySquare(String n){
		name = n;
	}


	public MonopolySquare(int location, MonopolySquare m)
	{

		this.location = location;
	}


	@Override
	public String toString() {
		return name;
	}

	public abstract void landOn(Player P) throws BankruptException;


	public abstract void printMessage(Player P);

}