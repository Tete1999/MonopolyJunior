public class Properties extends MonopolySquare
{
    // Property has cost of purchasing, name, isOwned status, and owner (Conditional)
    int price;
    String propertyName;
    boolean isOwned;
    Player ownerName;


    public Properties(int price,String propertyName, boolean isOwned, Player ownerName)
    {
        this.price = price;
        this.propertyName = propertyName;
        this.isOwned = isOwned;
        this.ownerName = ownerName;
    }


    public String getPropertyName() {
        return propertyName;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOwned() {
        return isOwned;
    }

    public Player getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(Player ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }

    public void landOn(Player P) throws BankruptException
    {
        if (!isOwned())
        {
            P.moneyFlow(-1*price);
            if (P.isBankrupt() == true)
            {
                throw new BankruptException("You are out of money");
            }
            setOwned(true);
            setOwnerName(P);
            printMessage(P);
        }

        else if (isOwned() && (getOwnerName() != P))  // owned by other Player
        {
            System.out.println("You have to pay up amount = " + price);
            P.moneyFlow(-1*price);
            if (P.isBankrupt() == true)
            {
                throw new BankruptException("You are out of money");
            }
        }
        else
        {
            System.out.println("You already own this property" + name);
        }

    }


    public void printMessage(Player P)
    {
        System.out.println("You landed on " + name + ".");
        System.out.println(P.getName() + "has purchased this");

    }

}

