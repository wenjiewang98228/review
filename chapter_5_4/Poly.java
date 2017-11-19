package chapter_5_3;

import java.util.Random;

public class Poly {

	Random rand = new Random();
	
	
	public Shape createShape() {
		int c = rand.nextInt(3);
		
		Shape s = null;
		
		switch(c){
			case 0: s = new Square();break;
			case 1: s = new Circle();break;
			case 2: s = new Triangle();break;
		}
		
		return s;
			
			
	}
}
