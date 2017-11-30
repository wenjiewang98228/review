package test_2;

public class Bag <T>{

	
	private T content;
	
	public Bag(T content){
		this.content = content;
	}
	
	public T get() {
		return content;
	}
	
	public void set(T t) {
		this.content = t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bag bag = new Bag("abc");
		
		System.out.println(bag.get());
		System.out.println(bag.get() instanceof String);
		
	}

}
