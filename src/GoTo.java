public class GoTo extends ChanceCard {

    private String name;
    private int goLocation;
    private Properties prop;

    GoTo(String name, int goLocation, Properties prop){
        super(name);
        this.goLocation = goLocation;
        this.name = name;
        this.prop = prop;
    }
    public void action(Player P) {
        System.out.println(name);
        P.setLocation(goLocation);

        try {
            prop.landOn(P);
        }
        catch (BankruptException e){
            System.exit(0);
        }
        }
    }

