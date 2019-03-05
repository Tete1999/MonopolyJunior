import java.util.ArrayList;

public class Properties extends MonopolySquare
{

    private String propertyName;
    Player ownerName;
    private int price;
    private Boolean isOwned;
    private String color;


    public Properties(int price,String propertyName, boolean isOwned, Player ownerName, String color) {
        super(propertyName);
        this.price = price;
        this.isOwned = isOwned;
        this.ownerName = ownerName;
        this.propertyName = propertyName;
        this.color = color;
    }


    public void landOn(Player P) throws BankruptException {
        if (isOwned == false){
            P.addBankBalance(-1*price);
            printMessage(P);
            System.out.println(P.getName() + " New Balance = " + P.getBankBalance()+ "\n");
            if (P.isBankrupt() == true)
            {
                throw new BankruptException(P.getName() + " is Bankrupt.");
            }
            setOwned(true);
            setOwnerName(P);
            P.ownedColors.add(color);
        }
        else if (isOwned && (!getOwnerName().equals(P))){
            System.out.println(P.getName() + " landed on " + propertyName);

            if (ownerName.getOwnedColorCount(color) == 2){
                System.out.println("Color " + color +" is a Monopoly so pay double rent.");
                System.out.println("You have to pay rent of $" + price*2);
                P.addBankBalance(-2*price);
                ownerName.addBankBalance(price*2);
                System.out.println(P.getName() + " New Balance = " + P.getBankBalance()+ "\n");
            }
            else {
                System.out.println("You have to pay rent of $" + price);
                P.addBankBalance(-1 * price);
                ownerName.addBankBalance(price);
                System.out.println(P.getName() + " New Balance = " + P.getBankBalance() + "\n");
            }

            if (P.isBankrupt())
            {
                throw new BankruptException(P.getName()+ " is Bankrupt.");
            }
        }
        else{
            System.out.println(P.getName() + " landed on " + propertyName);
            System.out.println("You already own this property " + propertyName + "\n");
        }
    }

    public void printMessage(Player P){
        System.out.println(P.getName() + " landed on " + propertyName);
        System.out.println(P.getName() + " purchased " + propertyName );
    }



    public Boolean getOwned() {
        return isOwned;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public int getPrice() {
        return price;
    }

    public Player getOwnerName() {
        return ownerName;
    }

    public void setOwned(Boolean isOwned) {
        this.isOwned = isOwned;
    }

    public void setOwnerName(Player ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }


    private void checkMonopoly(Player P){
        if (P.getOwnedColorCount(color) == 2){
            System.out.println("Color " + color +" is a Monopoly so pay double rent.");
        }
    }

}
