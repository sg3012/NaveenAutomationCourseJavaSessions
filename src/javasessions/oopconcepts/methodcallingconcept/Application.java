package javasessions.oopconcepts.methodcallingconcept;

public class Application {
	
	// This class Explains the concept of Execution Stack and Stack overflow error
	public void m1() {
		System.out.println("m1 method");
		m2(); // m1 is calling m2
	}

	public void m2() {
		System.out.println("m2 method");
		m3(); // m2 is calling m3
	}

	public void m3() {
		System.out.println("m3 method");
		m1(); // m3 is calling m1 again
	}

	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public static void main(String[] args) {
		
		Application app = new Application();
		app.m1(); // At this point m1 is called which is calling m2
		          // which is calling m3 and m3 is calling m1 again. This
		          // will create an infinite calling until it gives STACKOVERFLOW ERROR
		
		// Why STACKOVERFLOW error comes?
		// Once, we write a method call in our code there is one
		// EXECUTION STACK created inside the STACK MEMORY i.e.,
		// some stack memory is allocated to the execution stack.
		// For every method call JAVA will allocate some stack memory
		// to every execution and each stack is stored on top of the other.
		// Now, once the method calls are over in the entire code
		// JAVA starts deallocating the stack memory to every
		// execution stack in the LIFO fashion until all all
		// stack memory is freed. But if the method calls are never
		// ending or too many method calls then JAVA doesn't get a chance
		// to deallocate the stack memory reaching to a point where
		// these execution stacks' size go out the size of whole stack memory
		// giving stack over flow error.
		
		// Stack memory is used only for storing method execution/calls not for creation.
		// The actual methods will be created and stored in either Heap
		// or CMA / Meta Space. Stack memory contains the method calls
		// all the local variables declared inside those methods.
		// Heap, CMA or MetaSpace will contain all the other instructions written in the
		// methods like print statements, if-else logic etc.
		
		// Stack memory needs less space as compared to Heap
		// because it is deallocated automatically and immediately
		// once all the method calls are done which is not the case in Heap
		// as JAVA decides automatically when to call gc which is not very
		// common.
		
		// In real time automation framework it is possible that
		// we get stack over flow error but its not
		// common because if we are running multiple tests on a single browser
		// then a stack will be created only for that browser not for all
		// test method calls. Stack over flow happens mainly
		// doing parallel where we are running multiple browsers
		// at the same time.
		
		// For every method separate execution stack will be created
		// but for local variables (that are used as method parameters)
		// same execution stack will be used (the one created for method call).
		
		// Mechanism for stack is complex or heap is complex?
		// Mechanism for Heap memory is complex because JAVA has to 
		// decide and implement so many mechanisms that on what basis
		// the Objects should be destroyed and garbage collector is called.
		// But stack memory is straight forward meaning creating the execution
		// stacks are created and destroyed one by one once all the method calls
		// are done.

	}

}
