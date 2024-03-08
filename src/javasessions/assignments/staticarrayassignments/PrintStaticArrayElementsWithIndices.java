package javasessions.assignments.staticarrayassignments;

public class PrintStaticArrayElementsWithIndices {

	public static void main(String[] args) {

		// 17-04-2023

		// Print the values in an array along with the indices using for loop
		Object emp[] = new Object[5];
		emp[0] = "Shubham";
		emp[1] = "30";
		emp[2] = 20.67;
		emp[3] = 'M';
		emp[4] = true;

		for (int i = 0; i < emp.length; i++) {
			System.out.println(i + " = " + emp[i]);
		}
	}

}
