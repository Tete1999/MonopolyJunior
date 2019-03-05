import java.util.ArrayList;

public class Player {

	private String name;
	private int bankBalance;
	private int location;
	private Boolean isTurn;
	protected ArrayList<String> ownedColors = new ArrayList<String>();


	Dice d1 = new Dice();

	public Player(String name)
	{
		this.name = name;
		bankBalance = 31;
		location = 0;

	}
	public Boolean getTurn() {
		return isTurn;
	}

	public void setTurn(Boolean turn) {
		isTurn = turn;
	}

	public String getName() {
		return name;
	}

	public int getBankBalance()
	{
		return bankBalance;
	}

	public int getLocation() {
		return location;
	}


	public void setLocation(int location) {
		this.location = location % 32;
	}

	public void addBankBalance(int amount) {
		bankBalance += amount;
	}

	public void getPlayerBalance() {
		System.out.println(name + " You have this much money: " + bankBalance);
	}

	public Boolean isBankrupt(){
		return (bankBalance <=0);
	}

	int getOwnedColorCount (String color){
		int count = 0;
		for(String element: ownedColors){
			if(element.equals(color)){
				count += 1;
			}
		}
		return count;
	}

	public void move() {
		int roll = d1.roll();
		System.out.println(name + " Rolled a " + roll);
		setLocation(location + roll);
	}




}
