package javasessions.oopconcepts.abstractionconcept.abstractclasses;

public abstract class Page {
	// This class behaves as an abstract class. It is similar to a web page
	
	// To create abstract classes we use abstract keyword
	
	// We cannot create Object(s) of abstract classes
	
	// Abstract class could have both abstract and concrete methods
	
	// Abstract methods inside an abstract class MUST be declared 
	// using Abstract keyword.
	
	// Abstract classes can also have child classes
	
	// All Abstract methods of an Abstract class 
	// MUST be implemented in the child class. But we may or 
	// may not skip overriding the concrete methods of Abstract class.
	
	// We don't need to right abstract again for 
    // the implemented abstract methods in the child class
	// because abstract meaning there must not be any body associated
	// with the method but we are actually writing business
	// logic for that method in the child class which MUST have 
	// a body.
	
	// We can skip writing abstract methods in an abstract class
	// altogether. Meaning, all methods can have body. (0 % Abstraction).
	// This feature came in the versions later to JDK 1.8. So, we
	// can skip writing abstract methods altogether in Abstract classes.
	
	// We can write all methods as Abstract in an abstract class. 
	// Meaning, all methods don't have body. (100 % Abstraction).
	
	// We can write some methods as Abstract and some methods
	// as non-abstract in an abstract class. 
    // Meaning, some methods don't have body 
	// and some have body. (Partial Abstraction).
	
	// Meaning Abstract classes provide (0 - 100)% abstraction
	// i.e., 0%, 100%, partial abstraction
	
	// Abstract classes are always extended not implemented by the child classes
	// i.e. , we will use extends keyword in the child class
	// to implement the abstract methods of Parent Abstract class.
	
	// INTERVIEW QUESTION: Can I create constructor of an abstract class ? Why?
	// Ans: Yes. It is allowed only when we are inheriting from that class i.e, 
	// we are creating child of the abstract class because in JAVA there is a default mechanism
	// that whenever we create a child class constructor and create the object of child class
	// then JAVA will check and call the parent class constructor first before calling
	// the parent constructor. If the parent/child constructors are defined explicitly then they
	// will be called otherwise JVM will create a hidden constructor internally
	// in any of the classes and call it. So, to facilitate constructor calling 
	// for parent we can create constructor of parent Abstract class.
	// So, both classes' constructor will always be called (IN ANY CASE) 
	
	public Page() {
		this(5);
		System.out.println("Page -- Default Const....");
	}
	
	// if we comment above constructor and keep below constructor
	// then JAVA will give preference to whatever remaining constructors
	// are written in the class and tries to find default constructor because
	// JAVA ALWAYS calls parent class's default constructor no matter what. 
	// But as we only have parameterized constructor
	// JAVA will not be able to find any default constructor. 
	// So, it will throw below error in the child class constructors:
	// Implicit super constructor Page() is undefined. Must explicitly invoke another constructor
	
	// Now, if we don't want to define any default constructor inside
	// parent class and only the parameterised constructors then child 
	// class needs to call only the parameterized const. To do
	// that we will use super keyword in the child class (see super keyword 
	// section in the child class login page for more info)
	
	// Why Page is defined as an Abstract Class not Interface?
	
	// Because let's say if we are designing a web site having
	// different web pages and we say that all pages can
	// have some common functionalities of their own like
	// search on every page, display footers on each page,
	// page time out for every page will be same (almost).
	// So in this case we know that pages can take
	// some decisions about How some of the common features
	// to all the pages should be implemented. That is
	// why we have implemented page as an Abstract class
	// having partial abstraction ( Logic for some features is
	// written and for some features it will be dependent on
	// individual page how they will implement.
	
	// Overload parent class constructor
	public Page(int i) {
		System.out.println("Page -- Const...."+i);
	}

	
	public abstract void title(); // Abstract method
	
	public abstract void url(); // Abstract method
	
	public void defaultPageTimeOut() {
		System.out.println("Page -- time out = 20 secs"); // Concrete method
	}
	
	public static void displayFooters() {
		System.out.println("Page -- displayFooters"); // Concrete method
	}  // This method has been made static because
	   // we don't want any child page classes to override this method
	   // and implement their own footer display logic and change the footers for every page. 
	   // Because every page has exactly same footers MOST of the time
	   // so there is no need to override and write separate logic.
	
	public final void displayLogo() {
		System.out.println("Page -- displayLogo");
	} // This method has been made final because
	  // we don't want any child page classes to override this method
	  // and implement their own logo display logic and change the logo of company 
	  // on every page. Because every page has the same logo for the company 
	  // so there is no need to override and write separate logic.
	
	// INTERVIEW QUESTION : DIFFERENCE BETWEEN ABSTRACT CLASS AND INTERFACE
	
	// Interfaces provide 100% interface (up to JDK 1.8) always whereas
	// Abstract can provide 100% as well as Partial Abstraction also.
	
	// We cannot create constructor of an Interface anyhow but
	// we can create Constructor of Abstract class.
	
	// We can achieve multiple inheritance using interfaces
	// whereas we cannot achieve same using Abstract classes.
	
	// We can create normal variables inside abstract classes
	// but can't create the same inside interfaces i.e., 
	// All variables inside an interface are static and final by default
	// even if we don't write explicitly but variables in abstract
	// classes can be static and final only when we write explicitly other
	// wise they will be treated as any other variable
}
