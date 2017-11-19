package chapter_5_6;

public class AlarmDoor extends Door implements Alarm {

	public AlarmDoor(int length,int width) {
		super(length,width);
	}
	
	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("报警");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开门");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关门");
	}

}
