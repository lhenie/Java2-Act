public class Factorial
{
	static long factorial (int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return (n * factorial (n-1));
		}
	}
	public static void main (String[] args) {
		try{
			if(args.length < 1 || args.length > 1) {
				System.out.println("Must be two arguments.");
				return;
			}
			int num = Integer.parseInt(args[0]);
			if (num < 1 || num > 20) {
				System.out.println ("Number must be from 1 to 20.");
				return;
			}
			System.out.println (factorial(num));
		}
		catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
}
