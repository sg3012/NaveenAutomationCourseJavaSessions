package javasessions.oopconcepts.abstractionconcept.interfaces;

public interface IndianMedical extends WHO, UN {

	public void oncologyServices();

	public void dentalServices();

	public void gynoServices();
	
	public void emergencyServices(); // common method

}
