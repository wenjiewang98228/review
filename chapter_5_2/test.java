package chapter_5_1;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String ageString = JOptionPane.showInputDialog("enter your age:");
			if(Integer.parseInt(ageString) < 0) {
				throw new AnException("ÄêÁäÊäÈë´íÎó");
			}
			else {
				JOptionPane.showMessageDialog(null, ageString,"Age",1);
				System.out.println("your age is "  + Integer.parseInt(ageString));
			}
		}
		catch(AnException e) {
			System.out.println(e);
		}
	}

}
