import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing05
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int length=1,num,xaxis,yaxis;
		for(yaxis=1;yaxis<=20;yaxis=yaxis+2) {
			num=(length/2) + (length%2);
			for(xaxis=1;xaxis<=length;xaxis=xaxis+1) {
				terminal.setCursorPosition(11-xaxis,yaxis);
				if(11-xaxis<=10-length+num) {
					terminal.putCharacter('X');
				}else {
					terminal.putCharacter('Y');
				}
			}
			length++;
			if ((yaxis-1)%2 == 0 && (yaxis-1) != 0) {
				terminal.setCursorPosition(10,yaxis-1);
				terminal.putCharacter('|');
			}
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
