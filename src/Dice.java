import java.util.Random;

public class Dice {

    public Dice(){}

    public int roll()
    {
        Random r = new Random();
        int dRoll= r.nextInt(6) + 1;
        return dRoll;
    }
}
