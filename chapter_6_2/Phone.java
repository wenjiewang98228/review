package chapter_6_2;

import chapter_6_1.Contact;

public class Phone {

	private String phoneNum;
	private String type;
	
	private chapter_6_2.Contact aContact;
	
	public Phone(String phoneNum,String type,chapter_6_2.Contact aContact2) {
		setPhoneNum(phoneNum);
		setType(type);
		setaContact(aContact2);
		aContact.addPhoneToContact(this);
	}
	
	public chapter_6_2.Contact getaContact() {
		return aContact;
	}

	public void setaContact(chapter_6_2.Contact aContact2) {
		this.aContact = aContact2;
	}

	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
