package javasessions.oopconcepts.abstractionconcept.interfaces;

public class FortisHospital extends Medical implements UsMedical, UKMedical, IndianMedical {

	// This class behaves as grand child of WHO

	// We have to use implements keyword for a class building
	// logic for the methods inside an interface

	// To implement the inherited methods from an interface
	// we have to override those methods and use @Override
	// annotation

	// But using the annotation is not mandatory. We
	// generally use it for better readability

	// An interface behaves as a parent and the implementing class as a child. So,
	// they
	// exhibit parent - child relationship

	// The implementing class could have it's own methods as well

	// Child class has to implement the methods that are common in some interfaces only once
	// not multiple times

	// The child class implementing interfaces must implement all the methods
	// from the grand parent interfaces' methods also
	// even when they are not the child of grand parent directly.
	// Because a child class can inherit properties from Grand parents also

	// An implementing child class can have multiple parent interfaces but only
	// one parent class. Meaning a class can implement (from interface) as well as
	// extend (from a class) also. BUT, keep in mind the extends has to be written
	// before implement when both of these are present.

	//US
	@Override
	public void physioServices() {
		System.out.println("Fortis - physio services");
	}

	@Override
	public void cardioServices() {
		System.out.println("Fortis - cardio services");
	}

	@Override
	public void ENTServices() {
		System.out.println("Fortis - ENT services");
	}

	@Override
	public void test(int a) {
		// TODO Auto-generated method stub

	}

	// We have 2 override and implement overloaded get method from USMedical
	// 2 times as it is overloaded 2 times in the USMedical
	@Override
	public String get(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	//UK
	@Override
	public void neuroServices() {
		System.out.println("Fortis - neuroServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("Fortis - orthoServices");
	}

	//India
	@Override
	public void oncologyServices() {
		System.out.println("Fortis - oncologyServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("Fortis - dentalServices");

	}

	@Override
	public void gynoServices() {
		System.out.println("Fortis - gynoServices");

	}

	// Individual methods:

	public void medicalTraining() {
		System.out.println("Fortis - medicalTraining");
	}

	public void medicalInsurance() {
		System.out.println("Fortis - medicalInsurance");
	}

	// Common method from USMedical, UKMedical, IndianMedical
	@Override
	public void emergencyServices() {
		System.out.println("Fortis - emergencyServices");
	}

	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("Fortis - covidVaccination"); // Possible. Inherited and overridden method
		                                                 // from Grand Parent WHO
	}

	// UN
	@Override
	public void medicalNews() { // Possible. Inherited and overridden method
        // from Grand Parent WHO
		System.out.println("Fortis - medicalNews");
	}

//	@Override
//	default void billing() {
//		System.out.println("US -- billing");	// Error, Cannot reduce the visibility of inherited method
//		                                        // We must use public
//	}

	@Override
	public void billing() {
		System.out.println("US -- billing");
	}






}