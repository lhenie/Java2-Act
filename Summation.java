public class Summation {
	public static void main (String[] args) {
		try{
			if(args.length < 2 || args.length > 2) {
				System.out.println("Must be two arguments.");
				return;
			}
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if(num1 > num2) {
				int high = num1;
				num1 = num2;
				num2 = high;
			}
			if (num2 > 2000000000) {
				System.out.println("Number must be from 1 to 2000000000");
				return;
			}
			long sum = 0;
			for(int i = num1; i<= num2; i++) {
				sum += i;
			}
			System.out.println("Summation of " + num1 + " to " + num2 + " is " + sum );
		}
		catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
}
