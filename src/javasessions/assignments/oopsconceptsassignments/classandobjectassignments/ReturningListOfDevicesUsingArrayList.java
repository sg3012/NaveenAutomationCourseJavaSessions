package javasessions.assignments.oopsconceptsassignments.classandobjectassignments;

import java.util.ArrayList;

public class ReturningListOfDevicesUsingArrayList {
	// WAF:
	// getEmployeeDevices
	// you have to collect all the devices and return
	// Return: ArrayList<String> - because we have to return list of devices
	// and all device names will be string

	public ArrayList<String> getEmployeeDevices(String empName) {
		empName = empName.trim().toLowerCase();
		ArrayList<String> devicesList = new ArrayList<String>();
		switch (empName) {
		case "shubham":
			System.out.println("Getting employee devices list....");
			// iPhone 14, Macbook pro, Airtel SIM, Mouse
			devicesList.add("iPhone 14");
			devicesList.add("Macbook pro");
			devicesList.add("Airtel SIM");
			devicesList.add("Apple Mouse");
			break;
		case "waseem":
			System.out.println("Getting employee devices list....");
			// Samsung, Mouse
			devicesList.add("Samsung s13");
			devicesList.add("HP Mouse");
			break;
		case "neelam":
			System.out.println("Getting employee devices list....");
			// Macbook, Mouse, keyboard
			devicesList.add("Macbook Air");
			devicesList.add("Apple Mouse");
			devicesList.add("Apple Keyboard");
			break;
		default:
			System.out.println("Getting employee devices list....");
			// Macbook, Mouse, keyboard
			
			System.out.println("emp name "+empName+" is not found....");
			break;
		}

		return devicesList;

	}

	public static void main(String[] args) {

		ReturningListOfDevicesUsingArrayList obj = new ReturningListOfDevicesUsingArrayList();
		ArrayList<String> shubhamDevicesList = obj.getEmployeeDevices("Shubham");
		System.out.println(shubhamDevicesList); // Getting the device info for:Shubham
		                                        // [iPhone 14, Macbook pro, Airtel SIM, Apple Mouse]
		System.out.println("total number of devices:" 
		                                        + shubhamDevicesList.size()); // total number of devices: 4
		
		ArrayList<String> naveenDevicesList = obj.getEmployeeDevices("Naveen");
		System.out.println(naveenDevicesList); // Getting the device info for:Naveen
                                               // emp name naveen is not found....
                                               // []
		System.out.println("total number of devices:" 
		                                        + naveenDevicesList.size()); // total number of devices: 0
		
		
	}

}
