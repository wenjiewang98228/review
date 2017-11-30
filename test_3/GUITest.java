package test_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest extends JPanel implements MouseListener{

	ArrayList<Point> points = new ArrayList<Point>();
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setContentPane(new GUITest());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		points.add(new Point(e.getX(),e.getY()));
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Iterator<Point> it = points.iterator();
		if(it.hasNext()) {
			Point pr = it.next();
			while(it.hasNext()) {
				Point pl = it.next();
				g.drawLine(pr.getX(), pr.getY(), pl.getX(), pl.getY());
				pr = pl;
			}
		}
		
	}
	
	GUITest(){
		setBackground(Color.white);
		addMouseListener(this);
	}
}
