package ex3;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to input the first number
	    System.out.print("Input the first number: ");
	    
	    // Read and store the first number
	    int num1 = input.nextInt();
	    
	    // Prompt the user to input the second number
	    System.out.print("Input the second number: ");
	    
	    // Read and store the second number
	    int num2 = input.nextInt();
	    
	    input.close();
	    
	    // Calculate the sum of the two numbers
	    int sum = num1 + num2;
	    
	    // Display a blank line for separation
	    System.out.println();
	    
	    // Display the sum of the two numbers
	    System.out.println("Sum: " + sum);

	}

}
