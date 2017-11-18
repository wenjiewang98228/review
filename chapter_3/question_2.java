package chapter_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println(date.getTime());
		
		SimpleDateFormat dFormat = new SimpleDateFormat("EEEE/MMMM/dd/yyyy");
		System.out.println(dFormat.format(date));
		
		SimpleDateFormat dFormat1 = new SimpleDateFormat("yyyy - MM - dd");
		System.out.println(dFormat1.format(date));
		
		SimpleDateFormat dFormat2 = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’");
		System.out.println(dFormat2.format(date));
	}

}
