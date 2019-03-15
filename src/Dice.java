import java.util.Random;

class Dice {
    private Random r = new Random();
    Dice(){}

    int roll()
    {
        return r.nextInt(6) + 1;
    }
}
