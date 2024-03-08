package javasessions.assignments.oopsconceptsassignments.inheritanceassignments;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.momentOfIntertia(); // Absolutely possible
		                      // because Science is the
		                      // eldest Grandparent of BMW
		                      // and any child class could
		                      // access any of its Grand parents'
		                      // properties without any problem
		                      // WITHIN the same hierarchy

	}

}
