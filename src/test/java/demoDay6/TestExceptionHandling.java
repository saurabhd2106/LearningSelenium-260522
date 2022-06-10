package demoDay6;

import org.testng.annotations.Test;

public class TestExceptionHandling {

	@Test
	public void verifyExceptionHandling() {

		int[] arr = new int[5];

		try {

			arr[0] = 10;
			arr[1] = 10;
			arr[2] = 18;
			arr[3] = 17;
			arr[4] = 17;
			arr[5] = 16;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index out of bound exception");

			e.printStackTrace();

		} catch (IndexOutOfBoundsException e) {

			System.out.println("Array index out of bound exception");

		} finally {
			System.out.println("I always run");
		}

		System.out.println("After arr value update");
	}

	@Test
	public void verifyExceptionHandling1() {

		ExceptionHandlingExample ehe = new ExceptionHandlingExample();

		try {

			ehe.openBrowser();

			ehe.navigateToPage();

			ehe.performSomeAction();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			ehe.closeBrowser();
		}

	}
}
