package exception;

public class BadCharException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Hib�s adatbevitel!";
	}

}
