import java.util.ArrayList;

class Board {

    private ArrayList<MonopolySquare> propertyList;
    private LooseChange lc  = new LooseChange("Loosechange");
    Player p;
    private ChanceDeck cd;

    Board() {

        propertyList = new ArrayList<MonopolySquare>();
        propertyList.add(0, new Go("Go"));
        propertyList.add(1, new Chance("Chance1", cd));
        propertyList.add(2, new Properties(1, "Purple1", false, null, "Purple"));
        propertyList.add(3, new Properties(1, "Purple2", false, null, "Purple"));
        propertyList.add(4, new Chance("Chance2", cd));
        propertyList.add(5, new Railroad("RailRoad1"));
        propertyList.add(6, new Properties(2, "White1", false, null, "White"));
        propertyList.add(7, new Properties(2, "White2", false, null, "White"));
        propertyList.add(8, new Tax("Fireworks", lc, 2));
        propertyList.add(9, new Chance("Chance3", cd));
        propertyList.add(10, new Restroom("Restroom"));
        propertyList.add(11, new Properties(2, "Magenta1", false, null, "Magenta"));
        propertyList.add(12, new Properties(2, "Magenta2", false, null, "Magenta"));
        propertyList.add(13, new Railroad("RailRoad2"));
        propertyList.add(14, new Properties(3, "Orange1", false, null, "Orange"));
        propertyList.add(15, new Properties(3, "Orange2", false, null, "Orange"));
        propertyList.add(16, lc);
        propertyList.add(17, new Chance("Chance4", cd));
        propertyList.add(18, new Properties(3, "Red1", false, null, "Red"));
        propertyList.add(19, new Properties(3, "Red2", false, null, "Red"));
        propertyList.add(20, new Chance("Chance5", cd));
        propertyList.add(21, new Railroad("RailRoad3"));
        propertyList.add(22, new Properties(4, "Yellow1", false, null, "Yellow"));
        propertyList.add(23, new Properties(4, "Yellow2", false, null, "Yellow"));
        propertyList.add(24, new Tax("Waterworks", lc, 2));
        propertyList.add(25, new Chance("Chance6", cd));
        propertyList.add(26, new GoRestroom("GoRestroom", lc, 3));
        propertyList.add(27, new Properties(4, "Green1", false, null, "Green"));
        propertyList.add(28, new Properties(4, "Green2", false, null, "Green"));
        propertyList.add(29, new Railroad("RailRoad4"));
        propertyList.add(30, new Properties(5, "Blue1", false, null, "Blue"));
        propertyList.add(31, new Properties(5, "Blue2", false, null, "Blue"));
    }

        protected ArrayList<MonopolySquare> getPropertyList()
        {
            return propertyList;
        }
    protected void setChanceDeck(ChanceDeck cd) {
        this.cd = cd;
        propertyList.remove(1);
        propertyList.add(1, new Chance("Chance1", cd));
        propertyList.remove(4);
        propertyList.add(4, new Chance("Chance2", cd));
        propertyList.remove(9);
        propertyList.add(9, new Chance("Chance3", cd));
        propertyList.remove(17);
        propertyList.add(17, new Chance("Chance4", cd));
        propertyList.remove(20);
        propertyList.add(20, new Chance("Chance5", cd));
        propertyList.remove(25);
        propertyList.add(25, new Chance("Chance6", cd));

    }
}


