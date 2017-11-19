package chapter_7_1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloSwing extends JFrame{

	public HelloSwing() {
		super("×é¼þÏÔÊ¾");
		
		Container c = this.getContentPane();
	
	    c.setLayout(new FlowLayout());
	    
	    JTextField messageText = new JTextField(10);
	    
	    JLabel messageLabel = new JLabel("message:");
	    
	    JButton okBtn = new JButton("OK");
	    
	    c.add(messageLabel);
	    c.add(messageText);
	    c.add(okBtn);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setSize(300,100);
	    
	    this.setVisible(true);
	}
	
	public static void main(String args[]) {
		HelloSwing myApp = new HelloSwing();
	}
	
	
}
