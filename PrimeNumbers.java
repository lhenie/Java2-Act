public class PrimeNumbers 
{
	static boolean checkIfPrime (int n) {
	if (n==0 ||n==1) {
	return false;
	}
	for (int i=2;i==(n/2);i++) {
		if(n%i == 0) {
			return false;
		}
	}
	return true;
	}
	public static void main (String[] args) {
		try{
			if(args.length<2 || args.length>2) {
				System.out.println("Must be two arguments.");
				return;
			}
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			if(num1 > num2) {
				int high = num1;
				num1 = num2;
				num2 = high;
			}
			if(num1 < 0 || num2 < 0) {
				System.out.println ("Numbers must be greater than or equal to 0");
				return;
			}
			for(; num1 <= num2 ; num1++) {
				if(checkIfPrime(num1)) {
					System.out.println(num1 + " is a Prime Number");
				}
				else{
					System.out.println(num1 + " Is NOT a Prime number");
				}
			}
		}
		catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
} 
