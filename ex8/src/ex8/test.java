package ex8;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

			/*Write a Java program to compute the area of a polygon.
			Area of a polygon = (n*s^2)/(4*tan(π/n))
			where n is n-sided polygon and s is the length of a side*/
		
		Scanner input = new Scanner(System.in);
        
        // Prompt the user to input the number of sides on the polygon
        System.out.print("Input the number of sides on the polygon: ");
        
        // Read the number of sides from the user
        int ns = input.nextInt();
        
        // Prompt the user to input the length of one of the sides
        System.out.print("Input the length of one of the sides: ");
        
        // Read the length of one side from the user
        double side = input.nextDouble();
        
        // Calculate and display the area of the polygon
        System.out.print("The area is: " + polygonArea(ns, side) + "\n");
        
        input.close();
    }
    
    public static double polygonArea(int ns, double side) {
        // Calculate the area of a polygon based on the number of sides and side length
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
	}


