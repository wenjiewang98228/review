package chapter_3;

import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���������ɸ�����");
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		
		while(sc.hasNextDouble()) {
			double x = sc.nextDouble();
			
			m ++;
			sum += x;
		}
		
		System.out.println("����ĸ�����"+m);
		System.out.println("������ܺͣ�"+sum);
	}

}
