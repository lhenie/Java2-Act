import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String[] args) {
		try {
			File file = new File("phonebook.txt");
			Scanner sc = new Scanner(file);
			String data = "";
			
			while (sc.hasNext()) {
				data = sc.next();

				if(data.equals("1001-11")) {
					System.out.println("We've Found the Record!");
					System.out.println("Code: " + data);
					System.out.println("First Name: " + sc.next());
					System.out.println("Last Name: " + sc.next());
					System.out.println("CP No.: " + sc.next());
					break;
				}
			}
			sc.close();

		} catch (IOException e) {
            System.out.println("Exception");
        }
	}
}
