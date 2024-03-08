package javasessions.assignments.timecomplexityassignments;

public class TimeComplexityForNestedLoops {

	public static void main(String[] args) {

		for (int m = 0; m <= 9; m++) {
			for (int n = 0; n <= 9; n++) {
				for (int k = 0; k <= 9; k++) {
					System.out.print(m + "" + n + k + " ");
				}
			}
			System.out.println();
		}

		// Time complexity (outer loop):
		// m=0; Time complexity=1 (constant)
		// m<=9; Time complexity = n
		// m++; Time complexity = n

		// Time complexity (1st Inner loop):
		// n=0; Time complexity=1 (constant)
		// n<=9; Time complexity = n
		// n++; Time complexity = n
		// System.out.println(); Time complexity = n

		// Time complexity (2nd Inner loop):
		// k=0; Time complexity=1 (constant)
		// k<=9; Time complexity = n
		// System.out.print(m+""+n+k+" "); Time complexity = n
		// k++; Time complexity = n

		// FINAL TIME COMPLEXITY:
		// (1+n+n) (1+n+n+n) (1+n+n+n) = (1+2n) (1+3n) (1+3n)
		// (1+2n) (1+3n) (1+3n) = (1+2n)(1+6n+9n^2) = (1+6n+9n^2+2n+12n^2+18n^3)
		// (1+6n+9n^2+2n+12n^2+18n^3) = 18n^3 + 21n^2 + 8n + 1 = CUBIC EQUATION
		// 18n^3 + 21n^2 + 8n + 1 = Ignore 1
		// 18n^3 + 21n^2 + 8n = n(18n^2+21n+8)
		// n(18n^2+21n+8) = Ignore 8
		// n(18n^2+21n) = 3n^2(6n+7)
		// 3n^2(6n+7) = Ignore 7
		// 18n^3 = Ignore 18
		// Generalized Time complexity = O(n^3)
	}
}
