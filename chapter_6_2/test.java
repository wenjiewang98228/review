package chapter_6_2;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact aContact = new Contact(123,"С��",true);
		
		Phone Phone1 = new Phone("78912132","�칫",aContact);
		Phone Phone2 = new Phone("7896622132","����",aContact);
		Phone Phone3 = new Phone("7812432132","סլ",aContact);
		
		ArrayList phones = aContact.getPhoneArray();
		
		String name = aContact.getName();
		
		for(int i = 0; i < phones.size(); i++) {
			Phone aPhone = (Phone) phones.get(i);
			System.out.println("��ϵ�ȣ�" + name + "�绰��" + aPhone.getPhoneNum() + "����" + aPhone.getType());
		}
		
		System.out.println("��һ���������ϵ�ˣ�" + Phone1.getaContact().getName());
	}

}
