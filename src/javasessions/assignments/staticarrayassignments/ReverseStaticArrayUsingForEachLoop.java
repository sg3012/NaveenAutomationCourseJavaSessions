package javasessions.assignments.staticarrayassignments;

public class ReverseStaticArrayUsingForEachLoop {

	public static void main(String[] args) {
		// Print the values of an array in reverse order using for each loop

		Object emp[] = new Object[5];
		emp[0] = "Shubham";
		emp[1] = "30";
		emp[2] = 20.67;
		emp[3] = 'M';
		emp[4] = true;
		
		int count = emp.length - 1;
		for (Object e : emp) {
			e = emp[count];
			System.out.println(e);
			count--;
		}
	}

}
