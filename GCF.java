public class GCF
{
	public static void main (String[] args) {
		try{
			if(args.length<2 || args.length>2) {
				System.out.println("Must be two arguments.");
				return;
			}
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			int n1 = num1, n2 = num2;
			if(num1 > num2) {
				int high = num1;
				num1 = num2;
				num2 = high;
			}
			while (num1 != 0 && num2!=0) {
				int c= num2;
				num2 = num2 % num1;
				num1 = c;
			}
		System.out.println ("The GCF of " + n1 + " and " + n2 + " is " + (num1+num2));
	}
		catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
}
