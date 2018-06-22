import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sensitive_Keyboard implements KeyListener{
	Sensitive_Keyboard(){
		JFrame rob = new JFrame();
		rob.setVisible(true);
		rob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rob.addKeyListener(this);
	}
	public static void main(String[] args) {
		Sensitive_Keyboard dan = new Sensitive_Keyboard();
	}
	static void speak(String words) {
	    try {
	         Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	         e.printStackTrace();
	         }
	    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ouch");
		speak("ouch");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
