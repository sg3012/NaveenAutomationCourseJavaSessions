package javasessions.oopconcepts.methods;

import java.util.ArrayList;

public class Browser {

	// WAF:
	// getEmployeeDevices
	// you have to collect all the devices and return
	// Return: ArrayList<String> - because we have to return list of devices
	// and all device names will be string

	public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("Getting the device info for:" + empName);
		empName = empName.trim().toLowerCase(); // Trim because what if user provides blank spaces at the
		                                        // start and the end
		                                        // to lower case so that whatever case user provides
		                                        // the letters in it always checks based on the same casing.
		ArrayList<String> devicesList = new ArrayList<>(); // pc = 0
		if(empName.equals("shubham")) {
			// iPhone 14, Macbook pro, Airtel SIM, Mouse
			devicesList.add("iPhone 14");
			devicesList.add("Macbook pro");
			devicesList.add("Airtel SIM");
			devicesList.add("Apple Mouse");

		}

		else if(empName.equals("waseem")) {
			// Samsung, Mouse
			devicesList.add("Samsung s13");
			devicesList.add("HP Mouse");

		}

		else if(empName.equals("neelam")) {
			// Macbook, Mouse, keyboard
			devicesList.add("Macbook Air");
			devicesList.add("Apple Mouse");
			devicesList.add("Apple Keyboard");

		}

		else {
			System.out.println("emp name "+empName+" is not found....");
		}

		return devicesList; // This return is returning only a single entity called
		                    // an ArrayList of Strings which contains multiple values.
		                    // Also, keep in mind that a function can only
		                    // return single entity not multiple entities. That entity
		                    // could contain multiple items
	}

	public static void main(String[] args) {

		Browser obj = new Browser();
		ArrayList<String> shubhamDevicesList = obj.getEmployeeDevices("Shubham");
		System.out.println(shubhamDevicesList); // Getting the device info for:Shubham
		                                        // [iPhone 14, Macbook pro, Airtel SIM, Apple Mouse]
		System.out.println("total number of devices:" + shubhamDevicesList.size()); // 4

		ArrayList<String> naveenDevicesList = obj.getEmployeeDevices("Naveen");
		System.out.println(naveenDevicesList); // Getting the device info for:Naveen
		                                       // emp name naveen is not found....
		                                       // []
		System.out.println("total number of devices:" + naveenDevicesList.size()); // 0


	}

}
