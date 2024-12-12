package ex94;

public class Test {
		/*Write a Java program to extract the first half of a even string.
		Test Data: Python
		Sample Output: Pyt
		 */
	public static void main(String[] args) {
		// Define the main string
        String main_string = "salut_tout_le_monde";

        // Extract the substring from the beginning to the middle of the string
        String substring = main_string.substring(0, main_string.length() / 2);

        // Print the extracted substring
        System.out.println(substring);
	}

}
