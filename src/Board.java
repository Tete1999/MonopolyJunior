import java.util.ArrayList;
public class Board {

    private ArrayList<MonopolySquare> propertyList;
    LooseChange lc = new LooseChange("LooseChange");

    public Board() {


        propertyList = new ArrayList<MonopolySquare>();


        propertyList.add(0, new Go("Go"));


        propertyList.add("Chance1");

        propertyList.add(2, new Properties(1, "Purple1", false, null));
        propertyList.add(3, new Properties(1, "Purple2", false, null));

        propertyList.add("Chance2");

        propertyList.add(5, new Railroad("RailRoad1"));

        propertyList.add(6, new Properties(2, "White1", false, null));
        propertyList.add(7, new Properties(2, "White2", false, null));

        propertyList.add(8,new Tax("Fireworks", lc , 2));  // ASK PROF

        propertyList.add("Chance3");



        propertyList.add(10, new Restroom());

        propertyList.add(11, new Properties(2, "Magneta1", false, null));
        propertyList.add(12, new Properties(2, "Magneta2", false, null));


        propertyList.add(13, new Railroad("RailRoad2"));

        propertyList.add(14, new Properties(3, "Orange1", false, null));
        propertyList.add(15, new Properties(3, "Orange2", false, null));

        propertyList.add(16, new LooseChange("Loosechange"));

        propertyList.add("Chance4");

        propertyList.add(18, new Properties(3, "Red1", false, null));
        propertyList.add(19, new Properties(3, "Red2", false, null));

        propertyList.add("Chance5");

        propertyList.add(21, new Railroad("RailRoad3"));

        propertyList.add(22, new Properties(4, "Yellow1", false, null));
        propertyList.add(23, new Properties(4, "Yellow2", false, null));

        propertyList.add(24,new Tax("Waterworks", lc , 2));  // ASK PROF

        propertyList.add("Chance6");

        propertyList.add(26, new GoRestroom("GoRestroom", lc, 3));   // ASK PROF


        propertyList.add(27, new Properties(4, "Green1", false, null));
        propertyList.add(28, new Properties(4, "Green2", false, null));

        propertyList.add(29, new Railroad("RailRoad4"));

        propertyList.add(30, new Properties(5, "Blue1", false, null));
        propertyList.add(31, new Properties(5, "Blue1", false, null));



    }

    public ArrayList<String> getPropertyList()
    {
        return propertyList;
    }

    public void youLandedOn(int index)
    {
        System.out.println("You Landed on " + propertyList.get(index));
    }

}

