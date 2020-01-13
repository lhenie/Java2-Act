import java.io.*;
import java.util.*;

public class MidtermAct04
{
	public static void main(String[] args) throws Exception {
		try {
			File file = new File("phonebook.txt");
			Scanner sc = new Scanner(file);
			String data = "";
			while (sc.hasNext()) {
				data = sc.next();
				if(data.equals("1001-11")) {
					System.out.println("We've Found the Record!");
					System.out.println("The results display at the recordfound.txt");
					break;
				}
			}
			sc.close();

			PrintWriter out = new PrintWriter ("recordfound.txt");
			Scanner in = new Scanner(file);
			while (in.hasNext()){
				String str = in.next();
				if(str.equals("1001-11")) {
					out.println("Code: " + str);
					out.println("Firstname: " + in.next());
					out.println("Lastname: " + in.next());
					out.println("CP #: " + in.next());
					break;
				}
			}
			out.close();
			in.close();

		} catch(IOException e) {
            System.out.println("Exception");
        }
	}
}
