
/* Bunch of print Statements that make it little lengthy, but they make the game much more easier to follow */
public class Properties extends MonopolySquare
{

    private String propertyName;
    private Player ownerName;
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
        if (!isOwned){
            printMessage(P);
            P.addBankBalance(-1*price);
            if (P.isBankrupt())
            {
                System.out.println(P.getName() + " cannot complete this action");
                throw new BankruptException(P.getName() + " is Bankrupt.");
            }
            System.out.println(P.getName() + " purchased " + propertyName );
            System.out.println(P.getName() + " New Balance = " + P.getBankBalance()+ "\n");
            setOwned(true);
            setOwnerName(P);
            P.ownedColors.add(color);
        }
        else if (isOwned && (!getOwnerName().equals(P))){
            printMessage(P);

            if (checkMonopoly()){
                P.addBankBalance(-2*price);
                if (P.isBankrupt())
                {   System.out.println(P.getName() + " cannot complete this action");
                    throw new BankruptException(P.getName()+ " is Bankrupt.");
                }
                ownerName.addBankBalance(price*2);
                System.out.println(P.getName() + " New Balance = " + P.getBankBalance());
                System.out.println(ownerName.getName() + " New Balance After Receiving Rent = " + ownerName.getBankBalance() + "\n");
            }
            else {
                System.out.println("You have to pay rent of $" + price);
                P.addBankBalance(-1 * price);
                if (P.isBankrupt())
                {
                    System.out.println(P.getName() + " cannot complete this action");
                    throw new BankruptException(P.getName()+ " is Bankrupt.");
                }
                ownerName.addBankBalance(price);
                System.out.println(P.getName() + " New Balance = " + P.getBankBalance());
                System.out.println(ownerName.getName() + " New Balance After Receiving Rent = " + ownerName.getBankBalance() + "\n");
            }

        }
        else{
            printMessage(P);
            System.out.println("You already own this property " + propertyName + "\n");
        }
        P.setTurn(false);
    }

    public void printMessage(Player P){
        System.out.println(P.getName() + " landed on " + propertyName);
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


    private boolean checkMonopoly(){
        if (ownerName.getOwnedColorCount(color) == 2){
            System.out.println("Color " + color +" is a Monopoly so pay double rent.");
            System.out.println("You have to pay rent of $" + price*2);
            return true;
        }
        return false;
    }
}
