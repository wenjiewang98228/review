package chapter_5_6;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlarmDoor aDoor = new AlarmDoor(100,80);
		System.out.println(aDoor.getLength());
		System.out.println(aDoor.getWidth());
		
		aDoor.alarm();
		aDoor.open();
		aDoor.close();
	}

}
