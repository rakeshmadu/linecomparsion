import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to The Line Comparison Computation Program");
		
		Scanner scanner = new Scanner(System.in);              // scanner class to take the input from user
		System.out.print("Enter x1 of First Point: ");
		int x1 = scanner.nextInt();
		System.out.print("Enter y1 of First Point: ");
		int y1 = scanner.nextInt();
		System.out.print("Enter x2 of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.print("Enter y2 of Second Point: ");
		int y2 = scanner.nextInt();
		
		System.out.print("Enter x1 of Third Point: ");
		int p1 = scanner.nextInt();
		System.out.print("Enter y1 of Third Point: ");
		int q1 = scanner.nextInt();
		System.out.print("Enter x2 of Forth Point: ");
		int p2 = scanner.nextInt();
		System.out.print("Enter y2 of Forth Point: ");
		int q2 = scanner.nextInt();
		scanner.close();

		Double lenghtOfLine1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));      // calculate the length of first line
		Double lengthOfLine2 = Math.sqrt(Math.pow(p2-p1, 2) + Math.pow(q2-q1, 2));     // calculate the length of second line
		
		int result = lenghtOfLine1.compareTo(lengthOfLine2);                          // return 0 , <0 or >0  
		if(result > 0)
			System.out.println("Length of First end points is Greater than Length of Second end Points");
		else if(result < 0)
			System.out.println("Length of First end points is Less than Length of Second end Points");
		else
			System.out.println("Both lines are Equal");
	}
}
