package chapter_4;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Circle firstCircle = new Circle(50);
			int theRadius;
			theRadius = firstCircle.getRadius();
			double theCircumference;
			theCircumference = firstCircle.calculateCircumference();
			double theArea;
			theArea = firstCircle.calsulateArea();
			System.out.println("Բ�İ뾶Ϊ��" + theRadius);
			System.out.println("Բ���ܳ�Ϊ��" + theCircumference);
			System.out.println("Բ�����Ϊ��" + theArea);
		
			System.out.println(firstCircle.getDetails());
		
			System.out.println(firstCircle.getCount());
		}catch(Exception e ) {
			System.out.println("������Ϣ��");
		}finally {
			System.out.println("��һ��finally");
		}
		
		try {
			Circle firstCircle = new Circle(-50);
			int theRadius;
			theRadius = firstCircle.getRadius();
			double theCircumference;
			theCircumference = firstCircle.calculateCircumference();
			double theArea;
			theArea = firstCircle.calsulateArea();
			System.out.println("Բ�İ뾶Ϊ��" + theRadius);
			System.out.println("Բ���ܳ�Ϊ��" + theCircumference);
			System.out.println("Բ�����Ϊ��" + theArea);
		
			System.out.println(firstCircle.getDetails());
		
			System.out.println(firstCircle.getCount());
		}catch(Exception e ) {
			System.out.println("������Ϣ��");
		}finally {
			System.out.println("�ڶ���finally");
			
		
	}

}
}
