
/*
 * with this program i am starting to learn how to use loops and how much mathematical
 *  thinking is important for writing codes
 */
import acm.program.ConsoleProgram;

/**
 * this program works on Fibonacci sequence, where every number is the sum of
 * its previous 2 numbers.
 * 
 *
 */
public class Fibonacci extends ConsoleProgram {
	public void run() {
		// user is asked to choose a number of the sequence.
		int n = readInt(" Enter a number n > 0 : ");
		// 3 variables to use in the loop for creating the sequence.
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		// a for-statement because the user is the one who decides giving the initial
		// value of "n" how long the loop should go for.
		for (int i = 0; i < n; ++i) {
			sum = n1 + n2;
			n2 = n1;
			n1 = sum;
		}
		// input sum only if (sum !=0) is true.
		if (sum > 0) {
			println(sum);
		}
		// In case the user gives "0" as the the value of "n".

		if (n == 0) {
			println("Error");
		}
		// In case the user gives a negative number as the the value of "n".
		if (n < 0) {
			println("Error");
		}

	}

	public static void main(String[] args) {
		new Fibonacci().start();

	}

}
