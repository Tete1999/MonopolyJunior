public class Properties extends MonopolySquare {

    int price;
    String propertyName;
    boolean isOwned;
    Player ownerName;

    public Properties(int price, String propertyName, boolean isOwned, Player ownerName) {
        this.price = price;
        this.propertyName = propertyName;
        this.ownerName = ownerName;
        this.isOwned = isOwned;
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

