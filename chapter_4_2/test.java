package chapter_4_2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score sc = new Score();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("������Ӣ��ɼ���");
		sc.setEnglish(s.nextInt());
		System.out.println("������OOP�ɼ���");
		sc.setOop(s.nextInt());
		System.out.println("���������ݿ�ɼ���");
		sc.setDb(s.nextInt());
		
		sc.printTotal();
		sc.printAverage();
	}

}
