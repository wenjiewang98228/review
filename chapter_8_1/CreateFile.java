package chapter_8_1;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("myFile.txt");
			if(file.createNewFile()) {
				System.out.println("Successfully!");
			}
			else {
				System.out.println("has existed!");
			}
			
			System.out.println(file.exists());
			System.out.println(file.getPath());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
		}
	    catch(IOException e) {
	    	e.getStackTrace();
	    }
	}

}
