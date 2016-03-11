package perhitungan;

import java.util.Queue;
import java.util.Scanner;



public class ExerciseQueue {
	public void enQueue(Queue<Integer> q, int value) {
		// TODO Auto-generated method stub
		q.add(value);
		System.out.println("Data Berhasil Disimpan");
	}
	
	public void deQueue(Queue<Integer> q, int value) {
		// TODO Auto-generated method stub
		if(!q.isEmpty()){
			q.remove();
			System.out.println("Data Berhasil Dihapus");
		}else{
			System.out.println("Data Kosong");
		}
	}
	
	public void showElementStack(Queue<Integer> q) {
		
		if(!q.isEmpty()){
			Object[] queue = q.toArray();
			System.out.println("\n Data \n");
			
			for (int i = 0; i < q.size(); i++) {
				System.out.println(queue[i]+" ");
			}
			System.out.println();
		}else{
			System.out.println("Data Kosong");
		}
	}


	public boolean isEmpty(Queue<Integer> q){
		boolean empty= q.isEmpty();
		return empty;
		
	}
	
	
}
