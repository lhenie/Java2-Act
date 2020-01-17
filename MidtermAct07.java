import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class MidtermAct07
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int i,j;
		for (i=1;i<21;i++){
			terminal.setCursorPosition(i,1);
			terminal.putCharacter('X');
		}for (j=1;j<21;j++){
			terminal.setCursorPosition(j,2);
			terminal.putCharacter('X');
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
