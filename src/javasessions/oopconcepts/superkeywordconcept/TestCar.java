package javasessions.oopconcepts.superkeywordconcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW(); // Car default const......
		                   // BMW default const......
		                   // First the default const of car will be called
		                   // then the default const of BMW will be called
		System.out.println(b.min_speed); // 200. Why ?
		                                 // When we have a non-static
		                                 // variable with same name
		                                 // in the parent as well as
		                                 // child class in JAVA , preference
		                                 // will always be given to child class
		                                 // variable if the object is of child class
		                                 // and reference is also of child class.

		                                 // 50 if min_speed variable is not there in the child
		                                 // BMW then it will be inherited from the Grandparent Vehicle
		b.displaySpeed(); // 200 100 or
		                  // 50 if min_speed variable is not there in the child as well as parent
                          // BMW then it will be inherited from the Grandparent Vehicle

		                  // 100 if min_speed variable is not there in the child but there in parent
                          // and grandparent then preference will always be given to immediate parent
		                  // property

		// b.speed(); // BMW speed. Preference will be given to overriding method from
		           // child class if I am using child class object and child
		           // child class reference.
	    // But if we used super keyword to call the parent class
		// method also then the O/P will be:

		b.speed(); // BMW Speed
		           // Car Speed
		           // Car -- Testing


	}


}
