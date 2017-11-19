package chapter_6_2;

import java.util.ArrayList;

public class Contact {

	private ArrayList<Phone> phoneArray;
	
	private int contactID;
	private String name;
	private boolean isFreqContact;
	
	public Contact(int contactID,String name,boolean isFreqContact) {
		setContactID(contactID);
		setName(name);
		setFreqContact(isFreqContact);
		phoneArray = new ArrayList<Phone>(3);
	}
	
	public void addPhoneToContact(Phone aPhone) {
		phoneArray.add(aPhone);
		aPhone.setaContact(this);
	}
	
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public String getName() {
		return name;
	}
	
	public ArrayList<Phone> getPhoneArray() {
		return phoneArray;
	}

	public void setPhoneArray(ArrayList<Phone> phoneArray) {
		this.phoneArray = phoneArray;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isFreqContact() {
		return isFreqContact;
	}
	public void setFreqContact(boolean isFreqContact) {
		this.isFreqContact = isFreqContact;
	}
	
}
