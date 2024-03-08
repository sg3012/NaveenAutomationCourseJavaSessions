package javasessions.oopconcepts.abstractionconcept.interfaces;

public class TestHospital{

	public static void main(String[] args) {
	// This is a driver class which will act as a real time patient
	// utilizing the medical interfaces' functionalities  implemented by
	// Fortis Hospital class.
		FortisHospital fh = new FortisHospital();
		fh.physioServices(); // Overridden method from USMedical
		                     // O/P:  Fortis - physio services
		fh.cardioServices(); // Overridden method from USMedical
		                     // O/P: Fortis - cardio services
		fh.neuroServices(); // Overridden method from UKMedical
		                    // O/P: Fortis - neuro services
		fh.emergencyServices(); // Common method from USMedical, UKMedical, IndianMedical
		                        // O/P: Fortis - emergency services
		fh.dentalServices(); // Overridden method from IndianMedical
		                     // O/P: Fortis - Dental services
		fh.medicalInsurance(); // Individual method from FortisHospital
		                       // O/P: Fortis - medicalInsurance
		fh.medicalTraining(); // Individual method from FortisHospital
		                      // O/P: Fortis - medicalTraining
		System.out.println(UsMedical.min_fee); // Accessing the static final variable of
		                                       // interface Using interface name
		                                       // O/P: 10
		System.out.println(FortisHospital.min_fee); // Possible. Inherited variable from parent interface USMedical
		                                            //  So, the variables from parent interface can be inherited.
		
		UsMedical.USMedPharmacy(); // Static individual method of UsMedical interface. 
		                           // Accessed via interface name.
		// FortisHospital.USMedPharmacy(); // Not possible because static methods couldn't be inherited.
		                                   // Meaning, we can inherit STATIC VARIABLES but not STATIC METHODS
		                                   // inside an implementing class of an interface.
		fh.billing(); // Inherited default method of parent interface. Can access via child class 
		              // object reference.
		
//		UsMedical usm = new UsMedical(); // Error. Not possible to create Objects of Interfaces anyhow.
		
		// TOP-CASTING in interfaces
		// Child class objects referred by parent interface reference
		// What is child class and parent interface here ?
		// Child class - Fortishospital
		// Parent interfaces - USMedical, UKMedical, IndianMedical
		
		UsMedical usm = new FortisHospital(); // Possible because here object is of FortisHospital
		                                      // and reference variable is of Parent interface USMedical
		usm.cardioServices(); // possible because it is Overridden method from USMedical and 
		                      // available inside FortisHospital object
		                      // and we are accessing it using USMedical interface reference
		                      // So, it is somehow related to USMedical. REFERENCE TYPE CHECK Passed
		
		                      //O/P: Fortis - cardio services
		
		usm.physioServices(); // possible because it is Overridden method from USMedical and 
                              // available inside FortisHospital object
                              // and we are accessing it using USMedical interface reference
		                      // So, it is somehow related to USMedical. REFERENCE TYPE CHECK Passed
		
		                      //O/P: Fortis - physio services
		
		usm.ENTServices();    // possible because it is Overridden method from USMedical and 
        // available inside FortisHospital object
        // and we are accessing it using USMedical interface reference
        // So, it is somehow related to USMedical. REFERENCE TYPE CHECK Passed
		
		//O/P: Fortis - ENT services
		
		// usm.neuroServices();  // Not possible because it is Overridden method from UKMedical and 
        // available inside FortisHospital object
        // and we are accessing it using USMedical interface reference
        // So, it is not at all related to USMedical any how. REFERENCE TYPE CHECK failed
		
		// usm.orthoServices(); // Not possible because it is Overridden method from UKMedical and 
        // available inside FortisHospital object
        // and we are accessing it using USMedical interface reference
        // So, it is not at all related to USMedical any how. REFERENCE TYPE CHECK failed
		
		// usm.gynoServices(); // Not possible because it is Overridden method from IndianMedical and 
        // available inside FortisHospital object
        // and we are accessing it using USMedical interface reference
        // So, it is not at all related to USMedical any how. REFERENCE TYPE CHECK failed
		
		usm.emergencyServices(); // possible because it is Common Overridden method from all 
		// parent interfaces  and available inside FortisHospital object
        // and we are accessing it using USMedical interface reference
        // So, it is somehow related to USMedical. REFERENCE TYPE CHECK Passed
		
		//O/P: Fortis - emergencyServices
		
		
		// usm.medicalTraining(); // Not possible because it is individual method from Child class 
		// FortisHospital and available inside FortisHospital object
        // But we are accessing it using USMedical interface reference
        // So, it is not at all related to USMedical any how. REFERENCE TYPE CHECK failed
		
		// usm.medicalInsurance(); // Not possible because it is individual method from Child class 
		// FortisHospital and available inside FortisHospital object
        // But we are accessing it using USMedical interface reference
        // So, it is not at all related to USMedical any how. REFERENCE TYPE CHECK failed
		
		// DOWN CASTING in interfaces:
		// Parent interface object referred by child class reference
		
		// Is down-casting possible either at compile time or run time in JAVA in case of interfaces?
		
		// No down casting is not possible at compile time itself because we cannot 
		// create object of an interface at all in JAVA. So, at compile time only
		// it will fail. Because down casting is not possible at compile time
		// it is impossible at run time also

	}

}
