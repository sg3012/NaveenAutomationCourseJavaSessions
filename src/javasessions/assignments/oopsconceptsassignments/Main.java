package javasessions.assignments.oopsconceptsassignments;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

// THIS CLASS DEPICTS THE USE OF COMPARABLE AND COMPARATOR INTERFACES

// The main thing to keep in mind while using these interfaces is
// Natural ordering meaning whatever the ordering we define
// inside compareTo and compare methods. This user defined ordering itself.
// Will be considered natural ordering for that class.

//	 Create a class person with two data members:
//	 String name
//	 Int age
//
//	 Create 3 person objects with following:
//	 Mayur 32
//	 Prince 33
//	 Amit 34
//
//	 Sort person object with age

	public static void main(String[] args) {

//		// Method 1: Creating an array of Objects for class Person, sort the values
//		// using
//		// sort method of Arrays Class and COMPARABLE interface combo
//
//		// This is how we create/instantiate an array of Objects in JAVA
//		Person persons[] = new Person[3];
//
//		// This is how we initialize the Objects for Arrays in JAVA (Using class
//		// constructor):
//		persons[0] = new Person("Mayur", 35);
//		persons[1] = new Person("Amit", 25);
//		persons[2] = new Person("Prince", 33);
//
//		// Using sort method of Arrays Class to sort the Objects
//		Arrays.sort(persons);
//
//		// Using for each loop to iterate the persons array and print values
//		for (Person e : persons) {
//			System.out.println(e.getName() + ": " + e.getAge());
//		}

		// Method 2: Creating an array of Objects for class Person, sort the values
		// using sort method of Arrays Class and COMPARATOR interface combo

		Person persons[] = new Person[3];

		// This is how we initialize the Objects for Arrays in JAVA (Using class
		// constructor):
		persons[0] = new Person("Mayur", 35);
		persons[1] = new Person("Amit", 25);
		persons[2] = new Person("Prince", 33);

		// Create an Object of Comparator class of Person type:
		Comparator<Person> comparator = new PersonAgeComparator();

		// Using sort method of Arrays Class to sort the Objects
		Arrays.sort(persons,comparator);

		// Using for each loop to iterate the persons array and print values
		for (Person e : persons) {
			System.out.println(e.getName() + ": " + e.getAge());
		}
	}

}

//class Person implements Comparable<Person>{ // This class implements the Comparable interface which has
//	                                        // compareTo method to compare the class objects
//	String name;
//	int age;
//
//	// Constructor needed to initialize the values of
//	// name and age when we create an array of this class's
//	// Objects
//
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	@Override
//	public int compareTo(Person person) { // This method does the comparison of all the class objects one by one
//		                             // automatically.
//		// return this.age - person.age;  // In this line we are comparing the current object's
//		                               // (represented by this.age) age variable value with the
//		                               // next object's (represented by person.age ) age
//		                               // variable value.
//		                               // Through this line we achieve ascending order
//		 return person.age - this.age;  // In this line we are comparing the next object's
//        // (represented by person.age ) age variable value with the
//        // current object's (represented by this.age) age variable value.
//        // Through this line we achieve descending order
//
//	}

class Person{ // This class implements the Comparator interface which has
	// compare method to compare the class objects
	String name;
	int age;

// Constructor needed to initialize the values of
// name and age when we create an array of this class's
// Objects

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

class PersonAgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) { // This method does the comparison of all the class objects
												// one by one automatically.
		 return o1.age - o2.age; // In this line we are comparing the current
		// object's
		// (represented by o1.age) age variable value with the
		// next object's (represented by o2.age ) age
		// variable value.
		// Through this line we achieve ascending order

//		return o2.age - o1.age; // In this line we are comparing the next object's
								// (represented by o2.age ) age variable value with the
								// current object's (represented by o1.age) age variable value.
								// Through this line we achieve descending order
	}
}
