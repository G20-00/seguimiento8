package exceptions;

public class DayIncorrect extends Exception {
	private static final long serialVersionUID = 123124121L;

	public DayIncorrect(){
	    super("No puedes entrar este dia");
	  }
}
