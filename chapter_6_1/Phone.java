package chapter_6_1;

public class Phone {
	
	private String phoneNum;
	private String type;
	
	private Contact aContact;
	
	public Phone(String phoneNum,String type) {
		setPhoneNum(phoneNum);
		setType(type);
	}
	
	public Contact getaContact() {
		return aContact;
	}

	public void setaContact(Contact aContact) {
		this.aContact = aContact;
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
