
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to The Line Comparison Computation Program");
		
		Scanner scanner = new Scanner(System.in);          // scanner class to take the input from user
		System.out.print("Enter x1 of First Point: ");
		int x1 = scanner.nextInt();
		System.out.print("Enter y1 of First Point: ");
		int y1 = scanner.nextInt();
		System.out.print("Enter x2 of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.print("Enter y2 of Second Point: ");
		int y2 = scanner.nextInt();
		scanner.close();

		double lenghtOfLine = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));    // calculate the length of line
		System.out.printf("Length of Line is : %.2f %n", lenghtOfLine);             // %.2f %n to print only two digit after point
	}
}
