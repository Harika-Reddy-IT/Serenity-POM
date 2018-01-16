package SupportLibraries;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class AuthenticationHelper{
	public void LoginAuthentication(){
		try{
			System.out.println("in authentication");
			 Robot robot = new Robot();
			 Thread.sleep(12000);
			 robot.keyPress(KeyEvent.VK_C);
			 robot.keyPress(KeyEvent.VK_I);
			 robot.keyPress(KeyEvent.VK_G);
			 robot.keyPress(KeyEvent.VK_Q);
			 robot.keyPress(KeyEvent.VK_A);
			 robot.keyPress(KeyEvent.VK_I);
			 robot.keyPress(KeyEvent.VK_N);
			 robot.keyPress(KeyEvent.VK_BACK_SLASH);
			 robot.keyPress(KeyEvent.VK_H);
			 robot.keyPress(KeyEvent.VK_R);
			 robot.keyPress(KeyEvent.VK_E);
			 robot.keyPress(KeyEvent.VK_D);
			 Thread.sleep(500);
			 robot.keyPress(KeyEvent.VK_D);
			 robot.keyPress(KeyEvent.VK_Y);
			 Thread.sleep(2000);
			 robot.keyPress(KeyEvent.VK_TAB);
			 robot.keyPress(KeyEvent.VK_W);
			 robot.keyPress(KeyEvent.VK_E);
			 robot.keyPress(KeyEvent.VK_L);
			 robot.keyPress(KeyEvent.VK_C);
			 robot.keyPress(KeyEvent.VK_O);
			 robot.keyPress(KeyEvent.VK_M);
			 robot.keyPress(KeyEvent.VK_E);
			 robot.keyPress(KeyEvent.VK_1);
			 robot.keyPress(KeyEvent.VK_2);
			 robot.keyPress(KeyEvent.VK_3);
			 robot.keyPress(KeyEvent.VK_SHIFT);
			 robot.keyPress(KeyEvent.VK_1);
			 robot.keyPress(KeyEvent.VK_1);	
			 robot.keyRelease(KeyEvent.VK_SHIFT);
			 Thread.sleep(1000);		 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 Thread.sleep(5000);
		}catch(Exception e){
			System.out.println(e);
		}
		 
	}

}
