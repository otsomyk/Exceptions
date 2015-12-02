package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		String[] arr = new String[1];
		Exceptions ex = new Exceptions();

		try {
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array doesn't have index 2.");
			try {
				Exceptions.zeroDividing(0, 0);
			} catch (ArithmeticException c) {
				System.out.println("Error");
			} finally {
				System.out.println("close all files");
			}

			try {
				ex.workFinish(-2);
	            ex.workFinish(5);
	            ex.workFinish(10);

			} catch (MyExceptions c) {
				c.printStackTrace();
				System.out.println("My first own Exception");
			}
		}
	}

	public static double zeroDividing(int a, int b) {
		double c = a / b;
		return c;

	}

	public void workFinish(int time) throws MyExceptions {

		if (time < 0) {
			throw new MyExceptions();
		} else if (time > 9) {
			System.out.println("Go home");
		} else
			System.out.println("Must work");

	}
}
