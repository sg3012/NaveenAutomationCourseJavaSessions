package javasessions.oopconcepts.classesandobjects;

public class Student {

	// Class Variables
	// Class variables are also called data members of the class
	// String name = "Tom"; // This is not a right practice
	// and don't initialize any of the class variables
	// at the class level itself. Otherwise, every
	// object will have the same value for that variable
	// and we have to change it again and again.
	// In this case every student will have same name by default
	// i.e., Tom which doesn't seem right
	// So, only declare the variables to create a Blue Print, don't
	// initialize them at the class level itself.
	// Class variables are also called Instance Variables
	String name;
	int marks;
	char grade;

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Kunal";
		s1.marks = 85;
		s1.grade = 'B';

		Student s2 = new Student();
		s2.name = "Mitaj";
		s2.marks = 95;
		s2.grade = 'A';

		Student s3 = new Student();
		s3.name = "Satish";
		s3.marks = 60;
		s3.grade = 'C';

		System.out.println(s1.name + " " + s1.marks + " " + s1.grade); // Kunal 85 B
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade); // Mitaj 95 A
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade); // Satish 60 C

		System.out.println(s1); // It will give the address of this object reference
								// O/P: javasessions.oopconcepts.classesandobjects.Student@5acf9800

		// Class Objects will be stored inside the Heap Memory and their
		// references in the Stack Memory.

		// Creating an object with no reference:

		new Student(); // we can create an Object without any reference name.

		// This type will also be given a space in the Heap memory.

		// This type of Object too has the individual copies of the class
		// variables but no ref will be there to access those variables.

		// These type of Objects are also called 0 reference objects.
		// The problem with above approach of Object creation is that
		// we don't have any reference to initialize the Object properties.
		// If we have to initialize we have to do it like:

		new Student().name = "Shubham";
		new Student().marks = 95;

		// The problem with above approach for properties initialization
		// is we have to create new Object every time we have to
		// assign a value to single property. This will
		// Occupy the heap memory unnecessary along with no
		// values for other properties.

		// Creating ref without any Object:
		Student s4;
		s4 = new Student();
		s4.name = "Mahesh";

		Student s5 = new Student(); // An Object will be created inside the Heap and pointed
									// by s5 which is created in Stack.
		s5 = null; // With this line s5 will also point to null inside stack along with
					// pointing to Student Object in the Heap.

		s5.name = "Harish"; // Null Pointer Exception (NPE)
		System.out.println(s5.name); // Null pointer Exception at the previous line
										// as s5 is now pointing to null and JVM will read it as
										// null.name
		// These type of Objects (pointed by s5) also called NULL REFERENCE OBJECTS.

		// All the memory that is occupied by the Objects and their references
		// is taken from RAM.
		// The Heap and stack memory divisions have been allocated a fixed size by JAVA.
		// JVM will analyze the heap size automatically and regularly and activate a
		// program
		// called Garbage Collector which will automatically destroy Null Reference
		// or no reference Objects.
		// Garbage collector will only work on Heap Memory
		// Garbage Collector will no touch the objects that are having references.
		// Garbage collector will be called automatically but we could also call it
		// using
		// System class like this:

		System.gc();

		// But calling it manually doesn't give the guarantee that it will always be
		// activated
		// It will only get activated when JVM says so.
		// This concept is also called allocation
		// and deallocation of Heap Memory.

		// Now, if we have all the Objects with proper references in the memory
		// then the Heap Size will keep on increasing and GC will not do anything.
		// In that case you need to increase the RAM size of your machine and allocate
		// more memory to JAVA.

	}

}
