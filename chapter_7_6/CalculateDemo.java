package chapter_7_6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculateDemo extends JFrame implements ActionListener{

	Circle circle;
	JTextField messageText;
	JTextArea resultText;
	JButton calBtn;
	JButton closeBtn;
	
	public CalculateDemo() {
		super("����Բ���ܳ������");
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		
		messageText = new JTextField(5);
		JLabel messageLabel = new JLabel("����Բ�İ뾶");
		calBtn = new JButton("����");
		closeBtn = new JButton("�ر�");
		resultText = new JTextArea(4,20);
		
		
		centerPanel.add(messageLabel);
		centerPanel.add(messageText);
		centerPanel.add(calBtn);
		centerPanel.add(closeBtn);
		c.add(centerPanel);
		c.add(resultText);
		
		calBtn.addActionListener(this);
		closeBtn.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(360, 170);
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		new CalculateDemo();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == calBtn) {
			calculate();
		}
		if(e.getSource() == closeBtn) {
			System.exit(0);
		}
	}
	
	public void calculate() {
		String message = messageText.getText();
		
		if(message.length() == 0) {
			JOptionPane.showMessageDialog(null,"������Բ�İ뾶��","��ʾ",1);
		}
		else {
			int radius = Integer.parseInt(message);
			
			circle = new Circle(radius);
			
			resultText.setText("�ܳ�Ϊ��" + circle.calGirth() + "\n���Ϊ��" + circle.calArea());
		}
		
	}

}
