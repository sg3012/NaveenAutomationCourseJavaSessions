package javasessions.oopconcepts.abstractionconcept.interfaces;

//public interface UN extends Automation{ // Not possible because interface
//	                                    // cannot have a class as a Parent.
                                        //It can only have interface as a parent
//                                        // Following error will be thrown:
//                                        // The type Automation
//                                        // cannot be a superinterface of UN;
//                                        // a superinterface must be an interface
//	public void medicalNews();
//}

public interface UN{
	// This interface behaves as Grandparent of implementing class
	// i.e. , FortisHospital and parent for direct
	// child interfaces IndianMaeical,
	// USMedical, UKMedical
public void medicalNews();

}
