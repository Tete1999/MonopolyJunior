public class BankruptException extends Exception {
	public BankruptException(String message) {
		super(message);
		System.out.println(message);
	}
}
