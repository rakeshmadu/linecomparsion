import java.util.Scanner;

public class LineComparison {
	
	private void lengthOfLines(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
		
		/*
		 * calculate the length of first line
		 * calculate the length of second line
		 * print length of both lines
		 * call the methods for equal and compare
		 */
        Double lengthOfLine1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Double lengthOfLine2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
        System.out.printf("Length of First Line : %.2f %n", lengthOfLine1);
        System.out.printf("Length of Second Line : %.2f %n", lengthOfLine2);
        equal(lengthOfLine1, lengthOfLine2);
        compare(lengthOfLine1, lengthOfLine2);
    }
	
	/*
	 * equal method will return true if equal unless false
	 * based on that we can print the result
	 */
	private void equal(Double lengthOfLine1, Double lengthOfLine2) {
        boolean ans = lengthOfLine1.equals(lengthOfLine2);
        if(ans)
            System.out.println("Both Lines are Equal.");
        else
            System.out.println("Both Lines are not Equal.");
    }
	
	/*
	  * compareTo method return 0 , <0 or >0 
	  * based on that we can decide the relation between lines 
	  */
	 private void compare(Double lengthOfLine1, Double lengthOfLine2) {
        int res = lengthOfLine1.compareTo(lengthOfLine2);
        if(res > 0)
            System.out.println("Length of First Line is Greater than Length of Second Line");
        else if(res < 0)
            System.out.println("Length of First Line is Less than Length of Second Line");
        else
            System.out.println("Both Lines are Equal.");
    }

	public static void main(String[] args) {
		System.out.println("Welcome to The Line Comparison Computation Program");
		// taking the input from user
		Scanner scanner = new Scanner(System.in);
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
		
		LineComparison linecomp = new LineComparison();
		linecomp.lengthOfLines(x1, y1, x2, y2, p1, q1, p2, q2);
		
	}
}
