public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Monopoly. Let's play.\n");
        MonopolyGame m = new MonopolyGame();

        try {
            m.play();
        }

        catch (BankruptException e){
            System.out.println("Game Ended");
        }
    }
}
