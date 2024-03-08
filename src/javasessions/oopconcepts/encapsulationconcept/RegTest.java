package javasessions.oopconcepts.encapsulationconcept;

public class RegTest {

	// This class behaves as the runner class for Register.java

	public static void main(String[] args) {

		// Create user using all the properties

		// This line is behaving like an API POST Call - create user
		Register reg = new Register("Karan", 26, 1234567890L, "Pune", true);

		// See the details of user on profile page after registration

		// Below lines are behaving like API GET call - retrieve info
		System.out.println(reg.getName()); // Karan
		System.out.println(reg.getAge()); // 26
		System.out.println(reg.getPhoneNumber()); // 1234567890
		System.out.println(reg.getCity()); // Pune
		System.out.println(reg.isPerm()); // true

		System.out.println("---------");

		// update the values using setter:
		// Below lines are behaving like API PUT call - update the values
		reg.setCity("Bangalore");
		reg.setPhoneNumber(9876543210L);

		// Check profile again after updating the values:

		// Again these Lines are behaving like GET call
		System.out.println(reg.getName()); // Karan
		System.out.println(reg.getAge()); // 26
		System.out.println(reg.getPhoneNumber()); // 9876543210
		System.out.println(reg.getCity()); // Bangalore
		System.out.println(reg.isPerm()); // true

		System.out.println("---------");

		// Create user using only name and phone number:
		Register reg1 = new Register("Vishnu", 8877665544L);

		// Check profile after user creation
		System.out.println(reg1.getName()); // Vishnu
		System.out.println(reg1.getAge()); // 0, default value of int as we haven't given any value for age
		System.out.println(reg1.getPhoneNumber()); // 8877665544
		System.out.println(reg1.getCity()); // null, default value of String as we haven't given any value for city
		System.out.println(reg1.isPerm()); // false, default value of boolean as we haven't given any value for isPerm

		// updating the values which were not provided during user creation
		reg1.setAge(30);
		reg1.setCity("Delhi");
		reg1.setPerm(true);

		System.out.println("---------");

		// Check profile again after updates
		System.out.println(reg1.getName()); // Vishnu
		System.out.println(reg1.getAge()); // 30
		System.out.println(reg1.getPhoneNumber()); // 8877665544
		System.out.println(reg1.getCity()); // Delhi
		System.out.println(reg1.isPerm()); // true

	}
}
