package javasessions.fundamentals;

public class FinalKeyword {

	public static void main(String[] args) {
		// Final keyword is used to define the values which couldn't be changed
		// at all either during compile time or run time
		// after the point at which they are initialized.

		// Defining and initializing variables without final

		int a =10;
		a= 20;
		a=30;
		a=40;
		System.out.println(a); // 40 --> Latest value of a

		// Defining and initializing variables with final

		final int weekDays = 7; // Universal truth that no. of days in a week will
		                  // always be 7.

//		weekDays = 8; // error at this line that final variable couldn't be reassigned.
		              // we use final keyword in the scenarios where we don't
		              // want the values of the variables to be changed at all.
		int salary = 150 * weekDays;
		System.out.println(salary);

		final String title = "Login Page"; // title of login is not frequently changed while
		                                   // the application is in use. In fact, it's not changed at all.

		final double basePrice = 12.22; // some calculation is going on the basis of base price value.

		final int highestMarks = 100; // highest marks will always be 100;




	}
}
