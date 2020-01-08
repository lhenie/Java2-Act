import java.io.*;

public class Prelimact02
{
	public static void main (String[] args) throws IOException {
	try {
		BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
		String data = "",first = "",last = "", cpn = "";
		int ascii = 0, space = 0;
		boolean match = false;
		while ((ascii = in.read()) !=-1) { 
			data += String.valueOf((char)ascii);
			if (ascii == '\n'){
				data = "";
				space = 0;
			}if(ascii == ' ') {
				space++;
			}if (data.equals("1001-11")){
				System.out.println ("We've found the record!");
				match = true;
			}if(match == true && ascii != ' ') {
				if (space == 1) first += String.valueOf ((char)ascii);
				if (space == 2) last += String.valueOf ((char)ascii);
				if (space == 3) cpn += String.valueOf ((char)ascii);
			}if (match == true && ascii == '\n') match = false;
		}
		System.out.println ("Firstname: " + first);
		System.out.println ("Lastname: " + last);
		System.out.println ("CP#: " + cpn);
		in.close();
	}catch(IOException e) {
		System.out.print("Exception");
	} 
	}
}
