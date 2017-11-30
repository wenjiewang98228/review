package chapter_8_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] message = new byte[14];
		
		try {
			File file = new File("hello.txt");
			
			FileInputStream in = new FileInputStream("hello.txt");
			
			in.read(message);
			
			String text = new String(message);
			
			System.out.println(text);
			
			in.close();
		}catch(IOException e) {
			System.out.println(e);		}
	}

}
