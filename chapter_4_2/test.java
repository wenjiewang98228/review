package chapter_4_2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score sc = new Score();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("请输入英语成绩：");
		sc.setEnglish(s.nextInt());
		System.out.println("请输入OOP成绩：");
		sc.setOop(s.nextInt());
		System.out.println("请输入数据库成绩：");
		sc.setDb(s.nextInt());
		
		sc.printTotal();
		sc.printAverage();
	}

}
