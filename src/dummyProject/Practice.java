package dummyProject;

import java.util.Scanner;

public class Practice {
	private static void divide(int x, int y) {
		try {
       int result = x / y;
       System.out.println("Division is " + result );
		
		}
		catch(ArithmeticException e) {
			System.out.println("Input value zero of y is not divided the x value, change the value of y and try again");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		divide(x,y);
		

	}

	
}
