package perhitungan;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
	public static void test(Queue<Integer> q){
		MenuQueue m = new MenuQueue();
		m.repeatQueue(q);
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		test(q);
	}
}
