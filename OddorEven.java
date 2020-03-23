public class OddorEven
{
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
			for(; num1 <= num2 ; num1++) {
				if(num1%2==0) {
					System.out.println(num1 + " is Even");
				}
				else{
					System.out.println(num1 + " Is Odd");
				}
			}
		}
		catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
}
