package chapter_8_4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] message = "华中科技大学".toCharArray();
		
		try {
			File file = new File("testing.txt");
			
			FileWriter out = new FileWriter("testing.txt");
			
			out.write(message);
			
			System.out.print("文件写成功！");
			
			out.close();
			
			FileReader in = new FileReader("testing.txt");
			
			char[] read = new char[20];
			
			in.read(read);
			in.close();
			
			System.out.print(read);
		}catch(IOException e) {
			System.out.print(e);
		}
	}

}
