package ex98;

public class Tets {
		/*
		 * Write a Java program to test if the first and last element of two integer 
		 * arrays are the same. The array length must be greater than or equal to 2.
		 * Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
		 * array2 = 45, 20, 10, 20, 30, 50, 11
		 * Sample Output: false
		 */
	public static void main(String[] args) {
		
		 // Example 1: Arrays with different first and last elements
        int[] num_array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] num_array2 = {45, 20, 10, 20, 30, 50, 11};
        
        // Example 2: Arrays with the same first and last elements
        // int[] num_array1 = {50, -20, 0, 30, 40, 60, 50};
        // int[] num_array2 = {45, 20, 10, 20, 30, 50, 45};
        
        // Example 3: Arrays with lengths less than 2
        // int[] num_array1 = {50};
        // int[] num_array2 = {45};
        
        if (num_array1.length >= 2 && num_array2.length >= 2) {
            // Check if both arrays have lengths of at least 2 and if their first or last elements are equal
            System.out.println(num_array1[0] == num_array2[0] || num_array1[num_array1.length - 1] == num_array2[num_array2.length - 1]);
        } else {
            System.out.println("Array lengths less than 2.");
        }
	}

}
