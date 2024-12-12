package ex6;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		/*
		 * Write a Java program to compare two numbers.
         	Test Data:
			Input first integer: 25
			Input second integer: 39
		 * */
		
		// Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1; // First number to compare
        int number2; // Second number to compare

        // Prompt the user to input the first integer
        System.out.print("Input first integer: ");
        number1 = input.nextInt(); // Read the first number from the user

        // Prompt the user to input the second integer
        System.out.print("Input second integer: ");
        number2 = input.nextInt(); // Read the second number from the user
       
        input.close();
        
        // Compare and display the results
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
	}

}
