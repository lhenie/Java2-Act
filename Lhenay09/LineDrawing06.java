import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing06
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int length=1,num,xaxis,yaxis, count = 10, num2 = 10;
		String str = "Merry Christmas!";
		char[] c = str.toCharArray();

		for(yaxis=1;yaxis<=20;yaxis=yaxis+2) {
			num=(length/2) + (length%2);

			if ((yaxis-1) != 0) {
				terminal.setCursorPosition(10,yaxis-1);
				terminal.putCharacter('|');
				terminal.setCursorPosition(count,yaxis-1);
				terminal.putCharacter('/');
				terminal.setCursorPosition(num2,yaxis-1);
				terminal.putCharacter('\\');
			}

			for(xaxis=10;xaxis<=num2;++xaxis) {
				terminal.setCursorPosition(xaxis,yaxis);
				if((xaxis-10)<=((num2-11)/2)) {
					terminal.putCharacter('Y');
				}else {
					terminal.putCharacter('X');
				}
			}
			
			for(xaxis=1;xaxis<=length;xaxis=xaxis+1) {
				terminal.setCursorPosition(11-xaxis,yaxis);
				if(11-xaxis<=10-length+num) {
					terminal.putCharacter('X');
				}else {
					terminal.putCharacter('Y');
				}
			}
			length++;
			count--;
			num2++;

			for (int x = 18, cha = 0; x < 34; x++, cha++) {
				if (yaxis == 9) {
					terminal.setCursorPosition(x,yaxis);
					terminal.putCharacter(c[cha]);	
				}	
			}
		}
		
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
