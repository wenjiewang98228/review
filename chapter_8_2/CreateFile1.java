package chapter_8_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		byte[] message = "Welcome you!".getBytes();
		
		try{
			FileOutputStream out = new FileOutputStream("hello.txt");
			
			out.write(message);
		
			System.out.print("文件写成功！");
		
			out.close();
		}catch(IOException e) {
			System.out.print(e);
		}
		
		
	}

}
