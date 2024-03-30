package javasessions.assignments.classesandobjectsassignments;

public class UpdateObjectReferencePointers {
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		UpdateObjectReferencePointers u1 = new UpdateObjectReferencePointers(); // Object 1
		u1.name = "Shubham";
		u1.age = 30;
		u1.city = "Delhi";

		UpdateObjectReferencePointers u2 = new UpdateObjectReferencePointers(); // Object 2
		u2.name = "Prashant";
		u2.age = 40;
		u2.city = "Bangalore";

		UpdateObjectReferencePointers u3 = new UpdateObjectReferencePointers(); // Object 3
		u3.name = "Satish";
		u3.age = 33;
		u3.city = "Mumbai";

		UpdateObjectReferencePointers u4 = new UpdateObjectReferencePointers(); // Object 4
		u4.name = "Harshit";
		u4.age = 28;
		u4.city = "Pune";

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Shubham 30 Delhi
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Prashant 40 Bangalore
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Satish 33 Mumbai
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // Harshit 28 Pune

		System.out.println("--------");

		u1 = u2;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Prashant 40 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Prashant 40 Bangalore
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Satish 33 Mumbai
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // Harshit 28 Pune

		System.out.println("--------");

		u2 = u3;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Prashant 40 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Satish 33 Mumbai
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Satish 33 Mumbai
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // Harshit 28 Pune

		System.out.println("--------");

		u3 = u4;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Prashant 40 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Satish 33 Mumbai
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Harshit 28 Pune
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // Harshit 28 Pune

		System.out.println("--------");

		u4 = u1;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // Prashant 40 Bangalore
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // Satish 33 Mumbai
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // Harshit 28 Pune
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // Prashant 40 Bangalore

	}

}
