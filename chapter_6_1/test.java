package chapter_6_1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact aContact = new Contact(123,"ÒÀÒÀ",true);
		
		Phone aPhone = new Phone("1651651","¹¤×÷");
		
		aPhone.setaContact(aContact);
		
		System.out.println("Contact:" + aPhone.getaContact().getName() 
				+ "\nFrequent?" + aPhone.getaContact().isFreqContact());
		
		System.out.println("Phone : " + aPhone.getPhoneNum());
	}

}
