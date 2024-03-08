package javasessions.assignments.loopsassignments;

public class PrintASCIITableForNumbers {

	public static void main(String[] args) {
		// 2. Print the ASCII table for numbers from 0-9 (IMPORTANT interview question)

		for (char num = '0'; num <= '9'; num++) {
			System.out.println(num + " " + (int) num);
		}
	}

}
