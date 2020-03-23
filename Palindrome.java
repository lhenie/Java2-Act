public class Palindrome
{
	public static void main (String[] args) {
		try{
			if(args.length < 1 || args.length > 1) {
				System.out.println("Must be two arguments.");
				return;
			}
			String str_orig = args[0], str_rev="";
			int length = str_orig.length();
			for (int i=length-1;i>=0 ;i-- ) {
				str_rev += str_orig.charAt(i);
			}
			if (str_orig.equals (str_rev)) {
				System.out.println ("\"" + str_orig + "\" is a Palindrome");
			}
			else {
				System.out.println ("\"" + str_orig + "\" is NOT Palindrome");
			}
		}
			catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
}
