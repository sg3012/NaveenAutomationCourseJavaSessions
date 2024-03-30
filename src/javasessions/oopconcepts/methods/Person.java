package javasessions.oopconcepts.methods;

public class Person {
	// Method Overloading = Poly(many) + morphism(forms)

	public void test() { // 0 params
		System.out.println("0 params");
	}

	public String test(int a) { // 1 params
		System.out.println("0 params");
		return "testing";
	}

	public int test(int a, boolean flag) { // 2 params, with different return type
		System.out.println("0 params");
		return 100;
	}

//	public int pop() {
//		return 100;
//	}

//	public Integer pop() { // This is again duplicate even though this method
//		                   // is returning Integer wrapper class reference
//		return 1000;
//	}

	public Integer pop() { // This is overloading as the parameters are different
	      return 1000;
	}


//	public Integer pop(int a) { // This is overloading as the parameters are different
//      return 1000;
//    }

	public Integer pop(Integer a) { // This is again overloading
		                            // as previous method is returning primitve int
		                            // and this method is returning Integer class
		                            // reference(non-primitive)
		  System.out.println("Byee");
	      return 1000;
	}

//	public int pop(int a) {
//		System.out.println("Hiii");
//		return 100;
//	}

//	public int pop(long a) {
//		System.out.println("Hello");
//		return 1000;
//	}


	public void test(int a, int b) { // 2 params
		System.out.println("0 params");
	}

	public void test(String a) { // 1 param

	}

	public void test(String a, int b) { // 2 params - String, int

	}

//	public void test(String x, int y) { // 2 params - String, int
//		                                // Duplicate method even though the variable names
//		                                // are different. So, compiler will always check the data types
//		                                // not the variable names even they are different.
//
//	}

	public void test(int b, String a) { // 2 params - Not duplicate as the sequence of data types is different

	}

	public void test(int b, String a, int c) { // 3 params

	}

	// All the above methods are declared with the same name
	// but they have something different in their parameters
	// This is called Method Overloading.

	// Overloading is also called compile time/static Polymorphism
	// because when we write the method calls for overloaded methods
	// the compiler knows which method to be called already
	// by seeing the arguments in the calls and decides which
	// call to be mapped to which method definition before the actual call
	// happens. Meaning, when JVM calls the compiler
	// and compiles the .JAVA file to .class file
	// it's already written in the class file which method to be called.

	// Compile time Polymorphism is slightly faster than run time Polymorphism.

	// Overloading is also called Static binding.

	// Conditions for method overloading:
	// 1. Overloading of methods will always happen in the same class.
	// 2. All the methods will have same name.
	// 3. Methods have Different number of parameters but with same data type
	// 4. Method have Different types of parameters but with same number of
	// parameters.
	// 5. Methods have different sequence of parameters (data type and number of
	// parameters
	// may or may not be the same)
	// 6.Return type doesn't matter in overloading the methods i.e,
	// if they have different return types exactly same parameters then it is not
	// they are not overloaded and considered Duplicate.

	// REAL TIME USE CASES OF METHOD OVERLOADING:
	// Amazon:
	// search feature
	public void search() { // search without taking any keyword. Meaning, user will hit the search icon
							// directly and it gives all the products in the application

	}

	public void search(String prodName) { // Search giving results based on prod name.

	}

	public void search(String prodName, int price) { // search working on the basis of prod name and
														// price range passed
		System.out.println(prodName + " " + price);

	}

	public void search(String prodName, int price, String color) { // search working on the basis of prod name,
		// price range and color passed

	}

	// login feature:

	public void login() { // if the SSO login is provided then user has to login
							// to a particular account, hits the amazon login page it will
							// automatically login without any parameter required

	}

	public void login(String userName, String password) { // login with email or user name and password

	}

	public void login(String userName, String password, String role) {
		// login with email or user name, password and role of the user
		// whether user is an Admin,Super user, customer, vendor, partner etc.

	}

	public void login(String phoneNumber, int otp) {
		// login with phone number and otp

	}

	// payment/checkout feature

	public void doPayment(String cc, int cvv) {
		// payment using credit card and cvv
	}

	public void doPayment(String upiID) {
		// payment using upi for Indian customers
	}

	public void doPayment(String cc, int cvv, int otp) {
		// payment using credit card, cvv, otp
	}

	// Uber App:
	// Booking feature
	public void booking(String startPoint, String endPoint) {

	}

	public void booking(String startPoint, String endPoint, String carType) {

	}

	public void booking(String startPoint, String endPoint, String carType, int totalPersons) {

	}
	// Advantages of method overloading:
	// Readability is better in overloaded methods with different features.
//     Instead of writing all the features in the single method which will have
//	   lots of lines of code. So, if there will be a bug related to
//	   pricing only then we have to find a lot in the single search method
//	   But if we have written pricing feature in the overloaded search
//	   method we will just to the method having pricing feature and fix that bug

	// Maintenance will be easy. For e.g. if we have to add more
	// features related to pricing I could just go the
	// overloaded method having pricing features and add more features to it.t

	// Usability is better. User has more options to use
	// search feature according to their need.
	// For e.g.: with only product name, with product name and price range etc.

	public static void main(String[] args) {

		Person p = new Person();
		p.search("macbook"); // 2nd method will be called
		p.search("mouse", 1000); // 3rd method will be called
		p.pop(10); // we have written pop-method for taking
		           // both int and long primitive types which are both Integers
		           // now compiler will decide based on the int value given
		           // and the range it is falling in (int or long) and then
		           // it will map this call to the corresponding method.
		           // In this call it will map to int pop(int a)
		           // as 10 is in the int range.
//		p.pop(863543647L); // Now, this call will be mapped to int pop(long a)

		// How to call the pop method having Integer class reference:
//		Integer newNumber  = 10;
//		p.pop(newNumber); // Now, this will map to int pop(Integer a) and is called
		                  // call by reference.

		// Now, if we comment out int pop(int a) and int pop(long a) and call the pop
		// method again with int parameter. Now, compiler will map that call
		// to int pop(Integer a). This is called Auto-boxing.

		p.pop(10); // Byee


	}

	// NOTE:
	// We could pass around 255 parameters in a method signature.

}
