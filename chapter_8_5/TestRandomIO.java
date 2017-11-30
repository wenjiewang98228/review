package chapter_8_5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student("一一","15646848");
		Student stu2 = new Student("二二","15235765");
		Student stu3 = new Student("三三","15967348");
		
		RandomAccessFile randomW = null;
		RandomAccessFile randomR = null;
		
		try {
			randomW = new RandomAccessFile("student.txt","rw");
			
			randomW.write(stu1.getName().getBytes());
			randomW.write(stu1.getStudentID().getBytes());
			
			randomW.write(stu2.getName().getBytes());
			randomW.write(stu2.getStudentID().getBytes());
			
			randomW.write(stu3.getName().getBytes());
			randomW.write(stu3.getStudentID().getBytes());
			
			randomW.close();
			
			int len = 0;
			String str = null;
			
			byte[] buf = new byte[12];
			
			randomR = new RandomAccessFile("student.txt","r");
			
			randomR.skipBytes(12);
			System.out.println(randomR.getFilePointer());
			len = randomR.read(buf);
			
			randomR.read(buf);
			str = new String(buf,0,len);
			System.out.println(str);
			
			randomR.skipBytes(24);
			System.out.println(randomR.getFilePointer());
			randomR.read(buf);
			
			str = new String(buf,0,len);
			System.out.println(str);
			
			randomR.close();
		
		}catch(FileNotFoundException e1) {
			System.out.println(e1.getStackTrace());
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
