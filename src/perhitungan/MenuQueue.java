package perhitungan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Queue;
import java.util.Scanner;

public class MenuQueue {
	private void menuQueue() {
		// TODO Auto-generated method stub
		System.out.println("Menu queue");
		System.out.println("1. end ");
		System.out.println("2. del");
		System.out.println("3. print data ");
		System.out.println("4. isEmpty");
		System.out.println("5. Exit Program");
	}
	
	private void exception() {
		// TODO Auto-generated method stub
		
		System.out.println("Silahkan Coba Lagi");
		System.out.println();
	}
	
	public int pilihMenu(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Masukan Plihan");
		int pMenu = sc.nextInt();
		System.out.println();
		return pMenu;
	}
	
	private int Inputan() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		
		
			return input;
		
		
	}
	
	private void outComMenuQueue(Queue<Integer> q, int value) {
		// TODO Auto-generated method stub
		ExerciseQueue sq = new ExerciseQueue();
		
		switch (value) {
		case 1:
			sq.enQueue(q, Inputan());
			System.out.println();
			repeatQueue(q);
			break;
		case 2:
			sq.deQueue(q, Inputan());
			System.out.println();
			repeatQueue(q);
			break;
		case 3:
			sq.showElementStack(q);
			System.out.println();
			repeatQueue(q);
			break;
		case 4:
			System.out.println(sq.isEmpty(q));
			System.out.println();
			repeatQueue(q);
			break;
		case 5:
			System.out.println("Terimakasih");
			System.exit(0);
			break;
		default:
			exception();
			repeatQueue(q);
			break;
			
		}
	
	}
	
	public void repeatQueue(Queue<Integer> q){
		menuQueue();
		outComMenuQueue(q, pilihMenu());
	}
}
