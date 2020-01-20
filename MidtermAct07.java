import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct07
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int row,col;
		for (row=1;row<21;row++) {
			terminal.setCursorPosition(1,row);
			for (col=1;col<21;col++) {
				terminal.putCharacter('X');
			}
			System.out.println();
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
