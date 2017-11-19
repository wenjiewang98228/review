package chapter_6_1;

public class Contact {

	private int contactID;
	private String name;
	private boolean isFreqContact;
	
	public Contact(int contactID,String name,boolean isFreqContact) {
		setContactID(contactID);
		setName(name);
		setFreqContact(isFreqContact);
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
