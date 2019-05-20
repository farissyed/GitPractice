import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // It should be System.in, not System.out
		System.out.println("Type one integer");
		int a = s.nextInt();
		System.out.println("Type another integer");
		int b = s.nextInt();
		int avg = (a + b) / 2; // You should at least take the average of the correct numbers.
		System.out.println("This is the average of the two numbers: " + avg); // You weren't even printing out the right
																																					// value. I changed it to actually print out
																																					// the average.
	}
}
