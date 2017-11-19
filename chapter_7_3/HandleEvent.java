package chapter_7_3;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import chapter_7_5.KeyDemo;

public class HandleEvent extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField messageText;
	JButton clearBtn,closeBtn;
	JLabel messageLabel;
	
	public HandleEvent() {
		//super();
		
		Container c = this.getContentPane();
		
		c.setLayout(new GridLayout(2,1));
		
		JPanel upperPanel = new JPanel();
		JPanel lowerPanel = new JPanel();
		
		messageText = new JTextField(10);
		messageLabel = new JLabel("Message:");
		upperPanel.add(messageLabel);
		upperPanel.add(messageText);
		
		clearBtn = new JButton("Clear");
		closeBtn = new JButton("close");
		lowerPanel.add(clearBtn);
		lowerPanel.add(closeBtn);
		
		c.add(upperPanel);
		c.add(lowerPanel);
		
		clearBtn.addActionListener(this);
		closeBtn.addActionListener(this);
		
		this.setSize(300,140);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==clearBtn) {
			clearText();
		}
		if(e.getSource()==closeBtn) {
			shutdown();
		}
	}
	
	public void clearText() {
		messageText.setText("");
	}
	
	public void shutdown() {
		System.exit(0);
	}
	
	public static void main(String args[]) {
		new HandleEvent();
	}

	 
}
