package chapter_3;

import java.util.ArrayList;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myArr = new ArrayList<String>();
		myArr.add("����");
		myArr.add("����");
		myArr.add("����");
		System.out.println("���Զ�̬���飺");
		
		int i;
		int length = myArr.size();
		myArr.add(0, "���");
		for(i = 0; i <= length; i++) {
			if(i == 1) {
				myArr.set(i, "����");
			}
			System.out.println(myArr.get(i));
		}
	}

}
