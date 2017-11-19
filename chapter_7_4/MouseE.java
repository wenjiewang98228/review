package chapter_7_4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import chapter_7_5.KeyDemo;

public class MouseE extends JFrame implements MouseListener{

	private int i = 0;
	
	private String[] msgs = {"Java","PHP","Python"};
	
	JLabel lbl = new JLabel(msgs[i],JLabel.CENTER);
	
	
 	public MouseE() {
		this.setTitle("����¼�����");
		this.setSize(300,100);
		this.add(lbl);
		lbl.setFocusable(false);
		addMouseListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		i = i == 0?1:0;
		
		lbl.setText(msgs[i]);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("��������");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("�����ɿ�");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[]) {
		new MouseE();
	}
}
