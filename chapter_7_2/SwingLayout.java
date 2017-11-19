package chapter_7_2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingLayout extends JFrame{

	public SwingLayout() {
		super("布局显示");
		
		Container c = this.getContentPane();
		
		c.setLayout(new GridLayout(2,1));
		
		JPanel upperPanel = new JPanel(new FlowLayout());
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		JTextField messageText = new JTextField(10);
		JLabel messageLabel = new JLabel("输入数据：");
		JButton clearBtn = new JButton("Clear");
		JButton closeBtn = new JButton("close");
		
		upperPanel.add(messageLabel);
		upperPanel.add(messageText);
		lowerPanel.add(clearBtn);
		lowerPanel.add(closeBtn);
		
		c.add(upperPanel);
		c.add(lowerPanel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300,140);
		
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingLayout sl = new SwingLayout();
	}
}
