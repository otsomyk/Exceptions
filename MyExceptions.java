package exceptions;

public class MyExceptions extends RuntimeException {

	public MyExceptions() {

	}

	@Override
	public void printStackTrace() {

		System.out.println("Enter the correct time");
	}

}
