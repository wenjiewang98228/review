package test_2;

public class OldBag {
	
	private Object content;
	public OldBag(Object content) {
		this.content = content;
	}
	
	public Object get() {
		return content;
	}
	
	public void set(Object content) {
		this.content = content;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OldBag bag = new OldBag(123);
		System.out.println(bag.get());
		System.out.println(bag.get() instanceof Integer);
	}

}
