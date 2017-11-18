package chapter_3;

import java.util.ArrayList;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myArr = new ArrayList<String>();
		myArr.add("张三");
		myArr.add("李四");
		myArr.add("王五");
		System.out.println("测试动态数组：");
		
		int i;
		int length = myArr.size();
		myArr.add(0, "李红");
		for(i = 0; i <= length; i++) {
			if(i == 1) {
				myArr.set(i, "二二");
			}
			System.out.println(myArr.get(i));
		}
	}

}
