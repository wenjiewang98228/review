package chapter_5_5;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Office theOffice = new Office();
		
		theOffice.setPrinter(new BWPrinter() );
		theOffice.print("�ڰ�");
		
		theOffice.setPrinter(new ColorPrinter() );
		theOffice.print("��ɫ");
	}

}
