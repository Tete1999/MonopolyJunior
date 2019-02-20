public class Properties extends MonopolySquare {

    private int price;
    String propertyName;
    boolean isOwned;
    Player ownerName;


    public Properties(String propertyName)
    {
        super(propertyName);
    }


    public int getPrice() {
        return price;
    }

    public Player getOwnerName() {
        return ownerName;
    }

    public boolean isOwned() {
        return isOwned;
    }

    public String getPropertyName()
    {
        return propertyName;
    }


    }
}

