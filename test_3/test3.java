package test_2;

import java.util.LinkedList;
import java.util.Queue;

public class test3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		int time = Integer.parseInt("10");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = time; i >= 0; i--) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		
	}

}
