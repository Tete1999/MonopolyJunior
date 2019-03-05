public class ChanceCard {
    private int goLocation;
    private String action;
    private String type;


    ChanceCard( String type, String action, int goLocation)
    {
        this.goLocation = goLocation;
        this.action = action;
        this.type = type;
    }


    public String getAction() {
        return action;
    }

    public int getGoLocation() {
        return goLocation;
    }

    public String getType() {
        return type;
    }
}
