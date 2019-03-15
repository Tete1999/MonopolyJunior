public class FreeTicketBooth extends ChanceCard {

    private Properties p1;
    private Properties p2;
    private String color;


    FreeTicketBooth(String name, String color, Properties p1, Properties p2){
        super(name);
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
        this.name = name;
    }

    public void action(Player P) throws DrawNewCardException{
        System.out.println(name);
        if(!p1.getOwned() || !p2.getOwned()) {    // if one of the properties is not owned or both not owned
            if (!p1.getOwned()) {
                p1.setOwned(true);
                p1.setOwnerName(P);
                P.ownedColors.add(color);
                System.out.println("You now own property "+ p1.getPropertyName() + " for free\n");

            } else {
                p2.setOwned(true);
                p2.setOwnerName(P);
                P.ownedColors.add(color);
                System.out.println("You now own property "+ p2.getPropertyName() + " for free\n");
            }
            P.setTurn(false);
        }
        else if(p1.getOwned() && p2.getOwned()){
                if (p1.getOwnerName().equals(P)){
                    throw new DrawNewCardException("You already own both of these properties. Draw new chance card");
            }
                else{
                    throw new DrawNewCardException("Your opponent owns both of these properties. Draw new Chance Card");
                }
        }
    }
}
