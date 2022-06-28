package qsp;

import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class abc {

	public static void main(String[] args) throws IOException, AWTException
	{
		Runtime.getRuntime().exec("Notepad");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL );
	     r.keyPress(KeyEvent.VK_P );
	     r.keyRelease(KeyEvent.VK_CONTROL );
	}
		

	}


