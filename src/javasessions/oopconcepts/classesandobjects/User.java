package javasessions.oopconcepts.classesandobjects;

// INTERVIEW QUESTION:

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User(); // Object 1
		u1.name = "Rinku";
		u1.age = 30;
		u1.city = "Pune";

		User u2 = new User(); // Object 2
		u2.name = "Sapna";
		u2.age = 35;
		u2.city = "Bangalore";

		User u3 = new User(); //  Object 3
		u3.name = "Azmoon";
		u3.age = 40;
		u3.city = "NY";

		System.out.println(u1.name + " "+u1.age +" " +u1.city); // Rinku 30 Pune
		System.out.println(u2.name + " "+u2.age +" " +u2.city); // Sapna 35 Bangalore
		System.out.println(u3.name + " "+u3.age +" " +u3.city); // Azmoon 40 NY

		u1 = u2; // u1 is now pointing to u2

		System.out.println("------");
		System.out.println(u1.name + " "+u1.age +" " +u1.city); // Sapna 35 Bangalore
		System.out.println(u2.name + " "+u2.age +" " +u2.city); // Sapna 35 Bangalore
		System.out.println(u3.name + " "+u3.age +" " +u3.city); // Azmoon 40 NY

		u2 = u3;
		System.out.println("------");
		System.out.println(u1.name + " "+u1.age +" " +u1.city); // Sapna 35 Bangalore
		System.out.println(u2.name + " "+u2.age +" " +u2.city); // Azmoon 40 NY
		System.out.println(u3.name + " "+u3.age +" " +u3.city); // Azmoon 40 NY

		u3 = u1;

		System.out.println("------");
		System.out.println(u1.name + " "+u1.age +" " +u1.city); // Sapna 35 Bangalore
		System.out.println(u2.name + " "+u2.age +" " +u2.city); // Azmoon 40 NY
		System.out.println(u3.name + " "+u3.age +" " +u3.city); // Sapna 35 Bangalore

		// By this example we can say that an Object can have multiple references in JAVA.
	}

}
