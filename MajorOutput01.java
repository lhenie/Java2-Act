import java.io.*;
import java.util.Scanner;

public class MajorOutput01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter three numbers: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();

		System.out.println("You've Entered " + first + "," + second + "," + third + ".");
		if ((first>second) && (first>third)) {
			System.out.println("The Largest Number among the three is: " + first + ".");
		}else if((second>first) && (second>third)) {
			System.out.println("The Largest Number among the three is: " + second + ".");
		}else{
			System.out.println("The Largest Number among the three is: " + third + ".");
		}
	}
}