package kyu8;

public class Swapper {
	public Object[] arguments;

	public Swapper(Object[] args) {
		this.arguments = args;
	}

	public void swapValues() {
		arguments = new Object[] { arguments[0], arguments[1] };
		Object[] args2 = new Object[] { arguments[1], arguments[0] };
		arguments = args2;
	}
}