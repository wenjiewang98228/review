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
			System.out.println("圆的半径为：" + theRadius);
			System.out.println("圆的周长为：" + theCircumference);
			System.out.println("圆的面积为：" + theArea);
		
			System.out.println(firstCircle.getDetails());
		
			System.out.println(firstCircle.getCount());
		}catch(Exception e ) {
			System.out.println("错误信息：");
		}finally {
			System.out.println("第一个finally");
		}
		
		try {
			Circle firstCircle = new Circle(-50);
			int theRadius;
			theRadius = firstCircle.getRadius();
			double theCircumference;
			theCircumference = firstCircle.calculateCircumference();
			double theArea;
			theArea = firstCircle.calsulateArea();
			System.out.println("圆的半径为：" + theRadius);
			System.out.println("圆的周长为：" + theCircumference);
			System.out.println("圆的面积为：" + theArea);
		
			System.out.println(firstCircle.getDetails());
		
			System.out.println(firstCircle.getCount());
		}catch(Exception e ) {
			System.out.println("错误信息：");
		}finally {
			System.out.println("第二个finally");
			
		
	}

}
}
