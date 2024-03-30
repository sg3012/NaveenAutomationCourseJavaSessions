package javasessions.oopconcepts.encapsulationconcept;

public class Register {

	// This class shows ENCAPSULATION with the help of CONSTRUCTORS
	// It also shows how registration of a new user will be done.

	// As constructor is also setting the values of private variables of the class
	// There is no real use of writing setter methods separately. We can avoid writing those.
	// But writing getters is important as constructor is only setting the data
	// not fetching it. Fetching is done by getters.

	// THEN WHAT IS THE IMPORTANCE OF SETTERS?
	// They are important in case we need to update any one of the
	// private variables' / properties' values (Edit functionality) of the class then we could use the setter
	// method. For e.g. if after registering user wants to update his/her city or phonenumber
	// values then he can easily do that with the help of setter method setPhoneNumber
	// or setCity

	// ADVANTAGES OF CONSTRUCTOR IN ENCAPSULATION:
	// We restrict the users to create unnecessary default objects

	// We can create/register the user using the properties of our choice. So,
	// the end user has some flexibility to register with the info they want to give.

	// So, this type of class as we have created here called POJO(Plain Old Java Object) classes.
	// Following conditions should be satisfied to qualify a class for POJO:
	// --> POJO class cannot have any parent class
	// --> It should define Encapsulation.
	// --> Encapsulation should be defined as follows:
	       // - private variables
	       // - public getters
	       // - public setters (may or may not be there depending on the requirement)

	       // - public constructors to set the values of class variables and create objects
	       //    (again may or may not present, but it's usually a good practice to use constructors)

	       // - other public methods for some calculations
	// Encapsulation can also be created just by using private variables and public constructors
	// and no other methods. So, Encapsulation is not just about getters and setters.

	private String name;
	private int age;
	private long phoneNumber;
	private String city;
	private boolean isPerm;

	public Register(String name, int age, long phoneNumber, String city, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.isPerm = isPerm;
	}

	public Register(String name, long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}










}
