package javasessions.oopconcepts.encapsulationconcept;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		emp1.name = "Shubham";  Error, the field is not visible as it is private
		emp1.setName("Tom"); // changing the private variable "name" in Employee class
		                     // using public setter method "setName"
		emp1.setAge(30);
		emp1.setSalary(30.56);

		System.out.println(emp1.getName()); // accessing the value of private variable "name" in Employee class
                                           // using public getter method "getName"
		                                   // Tom
		System.out.println(emp1.getAge()); // 30
		System.out.println(emp1.getSalary()); //30.56

		System.out.println("-----------");

		Employee emp2 = new Employee();
		System.out.println(emp2.getName()); //null
		System.out.println(emp2.getAge()); // 0
		System.out.println(emp2.getSalary()); // 0.0

		// emp2.amount = "3000"; Error, amount field is not visible

//		System.out.println(emp2.getAmount()); //30
//		System.out.println(emp1.getAmount()); //30

		// what if getAmount method takes a fee parameter?
		// Then we will write the function call as follows:
		System.out.println(emp1.getAmount(20)); // 30
		System.out.println(emp2.getAmount(30)); // 40



	}

}
