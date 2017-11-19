package chapter_7_5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class KeyDemo extends JFrame implements KeyListener{

	JLabel lab = new JLabel();
	
	public KeyDemo() {
		add(lab);
		
		lab.setHorizontalAlignment(SwingConstants.CENTER);
		
		lab.setFont(new Font("Serif",Font.ITALIC,25));
		
		lab.setForeground(Color.RED);
		
		this.setTitle("º¸≈ÃœÏ”¶");
		this.setSize(350,200);
		this.setLocationRelativeTo(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		
	}
	
	public static void main(String args[]) {
		new KeyDemo();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lab.setText(e.getKeyChar() + "");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		lab.setText(e.getKeyCode() + "");
	}

	
}
