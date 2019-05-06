import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		Scanner s = new Scaner(System.out);
		System.in.println("Type one integer");
		int a = s.nextInt();
		System.out.println("Type another integer");		
		int b = Scanner.nextInt();
		int avg = a + b / 2; 
		System.out.println("This is the average of the two numbers: " + avg);
	}
}
