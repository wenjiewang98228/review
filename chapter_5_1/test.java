package chapter_5;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FulltimeEmp fm = new FulltimeEmp(2008021,"’≈∑…","sw",50000,80);
		ParttimeEmp pm = new ParttimeEmp(20100316,"¿Ó∫Ï","cs",100);
		
		String info1 = fm.getDetails();
		String info2 = pm.getBaseDetails();
		System.out.println(info1 + "\n" + info2);
	}

}
