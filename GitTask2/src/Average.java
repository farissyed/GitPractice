import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type one integer");
		int a = s.nextInt();
		System.out.println("Type another integer");		
		int b = s.nextInt();
		int avg = (a + b) / 2; 
		System.out.println("This is the average of the two numbers: " + avg);
	}
}
