import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing03
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int row=1,col=1,i=1,j=1;
		for(;row<20;row=row+2,i++) {
			j=(i/2) + (i%2);
			for(col=1;col<=i;col++) {
				terminal.setCursorPosition(col,row);
				if(j>=col) {
					terminal.putCharacter('X');
				}else {
					terminal.putCharacter('Y');
				}
			}
			j++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
