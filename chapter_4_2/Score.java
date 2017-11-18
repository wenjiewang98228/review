package chapter_4_2;

public class Score {

	private int english;
	private int oop;
	private int db;
	
	public Score() {
		
	}
	
	public double calTotal() {
		return english + oop + db;
	}
	
	public void printTotal() {
		System.out.println(calTotal());
	}
	
	public void printAverage() {
		System.out.println(calAverage());
	}
	
	public double calAverage() {
		return (english + oop + db)/3;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getOop() {
		return oop;
	}

	public void setOop(int oop) {
		this.oop = oop;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}
	
}
