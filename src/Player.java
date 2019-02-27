import java.util.Random;

public class Player {
	private String name;
	private int bankBalance;
	private int location;

	Dice d1 = new Dice();


	public Player(String name)
	{
		this.name = name;
		bankBalance = 31;
		location = 0;
	}

	public int getBankBalance()
	{
		return bankBalance;
	}

	public String getName() {
		return name;
	}

	public void moneyFlow(int value)
	{
		bankBalance += value;
	}

	public boolean isBankrupt()
	{
		return (bankBalance <= 0);
	}

	public void setLocation(int loc)
	{
		location = loc % 32;
	}

	public void move(){
		int roll = d1.roll();
		setLocation(location + roll);
		System.out.println(name + " Rolled a " + roll);
	}

	public int tempLoc(int location)   // Solely for purpose of FreeTicket booth for chance class
	{
		Random r = new Random();
		int loc = location + r.nextInt(32) % 32;
		return loc;

	}



	public void getPlayerBalance()
	{
		System.out.println(name + " You have this much money: " + bankBalance);
	}
}

