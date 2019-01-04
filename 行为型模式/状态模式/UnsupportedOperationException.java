package 状态模式;

public class UnsupportedOperationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public UnsupportedOperationException () {}
	
	public UnsupportedOperationException (String message) {
		super(message);
	}
}
