package ex7;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
			
		/*Write a Java program to compute hexagon area.
		Area of a hexagon = (6 * s^2)/(4*tan(π/6))
		where s is the length of a side
		*/
		Scanner input1 = new Scanner(System.in);
        
        // Prompt the user to input the length of a side of the hexagon
        System.out.print("Input the length of a side of the hexagon: ");
        
        // Read the length of a side from the user
        double s = input1.nextDouble();
        
        // Calculate and display the area of the hexagon
        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");
        input1.close();
	}

    public static double hexagonArea(double s) {
        // Calculate the area of a hexagon based on its side length
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }

}
