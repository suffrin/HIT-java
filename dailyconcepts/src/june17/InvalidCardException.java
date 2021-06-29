package june17;
public class InvalidCardException extends Exception{
	String msg;
	public InvalidCardException(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String toString() {
		return "Exception is..:"+msg;
	}
}