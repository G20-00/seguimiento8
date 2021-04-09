package exceptions;

	public class IdException extends Exception{
	private static final long serialVersionUID = 121313L;
	private String id;
	public IdException(String id1) {
		super("The product price can't be negative. The price is "+id1);
	    id = id1;
	}
	public String getId() {
		return id;
	}
}
