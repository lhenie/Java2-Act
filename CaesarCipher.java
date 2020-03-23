public class CaesarCipher
{
	static String encryptText(String text, int toskip) {
		String encrypted="";
		for (int i=0; i<text.length();i++) {
			int decval=0;
			if(Character.isUpperCase(text.charAt(i))) {
				decval = ((int) text.charAt(i) + toskip -65) % 26;
				if(decval>=0) {
					decval +=65;
				}
				else {
					decval +=91;
				}
			}
			else{
				decval = ((int) text.charAt(i) + toskip - 97) % 26;
				if(decval >=0){
					decval +=97;
				}
				else{
					decval +=123;
				}
			}
			encrypted += (char) decval;
		}
		return encrypted;
	}
	public static void main (String[] args) {
		try {
			if(args.length <=1) {
				System.out.println(" Please enter two arguments.");
				return;
			}
			else if (args.length>=3) {
				System.out.println("Two arguments only.");
				return;
			}
			String text = args[0];
			int s = Integer.parseInt(args[1]);
			System.out.println("Text: " + text);
			System.out.println("Shift: " + s);
			System.out.println("Cipher: " + encryptText(text, s));
		}

			catch (Exception e) {
			System.out.println ("Invalid Input: " + e);
		}
	}
}
