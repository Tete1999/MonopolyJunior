public class Player {
	private int bankAccount;
	private String name;
	private boolean isTurn;
	private int location;

	public Player(String n){
		name = n;
		bankAccount = 31;
		location = 0;
		isTurn = False;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void addBankaccount(int amount){
		bankAccount = bankAccount + amount;
	}

	public void minusBankaccount(int amount)
	{
		bankAccount = bankAccount - amount;
	}

	public int getLocation()
	{
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void newLocation(int diceRolled)
	{
		int tracker = location + diceRolled;
		if (tracker >= 31)
		{
			location = tracker - location;
			setLocation(location);
		}
		else
		{
			location = location + diceRolled;
			setLocation(location);
		}

	}

	/* you will add several methods to this class as needed.*/

	/* Whenever you adjust the location, don't forget to check
	to see if you passed "Go".   The instructions explicitly said
	that this was the responsiblity of the player, so this
	functionality belongs here.

	(unless you are told to go "directly" to location, i.e. jail/restroom)
	 */
}
