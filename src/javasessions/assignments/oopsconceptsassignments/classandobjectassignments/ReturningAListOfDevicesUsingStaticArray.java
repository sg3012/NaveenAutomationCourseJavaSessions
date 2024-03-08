package javasessions.assignments.oopsconceptsassignments.classandobjectassignments;

import java.util.Arrays;

public class ReturningAListOfDevicesUsingStaticArray {
	// WAF:
	// getEmployeeDevices
	// you have to collect all the devices and return
	// Return: String[] - because we have to return list of devices
	// and all device names will be string

	public String[] getEmployeeDevices(String empName) {
		empName = empName.trim().toLowerCase();
		String devicesList[];
		System.out.println("Getting employee devices list...");
		if (empName.equals("shubham")) {
			// iPhone 14, Macbook pro, Airtel SIM, Mouse
			devicesList = new String[] { "iPhone 14", "MacBook Pro", "Apple Mouse", "Airtel SIM" };
			return devicesList;

		}

		else if (empName.equals("waseem")) {
			// Samsung, Mouse
			devicesList = new String[] { "Samsung s13", "HP Mouse" };
			return devicesList;

		}

		else if (empName.equals("neelam")) {
			// Macbook, Mouse, keyboard
			devicesList = new String[] { "Macbook Air", "Apple Mouse", "Apple Keyboard" };
			return devicesList;

		}

		else {
			System.out.println("emp name " + empName + " is not found....");
			return devicesList = new String[] {}; // to show no string data is present
		}

	}

	public static void main(String[] args) {

		ReturningAListOfDevicesUsingStaticArray Obj = new ReturningAListOfDevicesUsingStaticArray();
		String shubhamDevicesList[] = Obj.getEmployeeDevices("Shubham");
		System.out.println(Arrays.toString(shubhamDevicesList)); // Getting employee devices list...
																	// [iPhone 14, MacBook Pro, Apple Mouse, Airtel SIM]

		System.out.println("total number of devices:" + shubhamDevicesList.length); // total number of devices:4

		String naveenDevicesList[] = Obj.getEmployeeDevices("Naveen");
		System.out.println(Arrays.toString(naveenDevicesList)); // Getting employee devices list...
		                                                        // emp name naveen is not found....
															    // []

		System.out.println("total number of devices:" + naveenDevicesList.length); // total number of devices:4
	}

}
