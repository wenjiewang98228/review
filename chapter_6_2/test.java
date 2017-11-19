package chapter_6_2;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact aContact = new Contact(123,"小雨",true);
		
		Phone Phone1 = new Phone("78912132","办公",aContact);
		Phone Phone2 = new Phone("7896622132","生活",aContact);
		Phone Phone3 = new Phone("7812432132","住宅",aContact);
		
		ArrayList phones = aContact.getPhoneArray();
		
		String name = aContact.getName();
		
		for(int i = 0; i < phones.size(); i++) {
			Phone aPhone = (Phone) phones.get(i);
			System.out.println("联系热：" + name + "电话：" + aPhone.getPhoneNum() + "类型" + aPhone.getType());
		}
		
		System.out.println("第一个号码的联系人：" + Phone1.getaContact().getName());
	}

}
