package Semaphore;

import java.util.concurrent.Semaphore;

class Shared{
	static int count=0;
}

class MyThread extends Thread{
	Semaphore sem ;
	String threadName;
	public MyThread(Semaphore sem, String threadName) {
		super(threadName);
		this.sem= sem;
		this.threadName= threadName;
	}
	@Override
	public void run() {
		if(this.getName().equals("A")) {
			System.out.println("Starting "+threadName);
			try {
				System.out.println(threadName+" Waiting for the permit");
				sem.acquire();
				System.out.println(threadName+" gets a Permit");
				for(int i=0;i<5;i++) {
					Shared.count++;
					System.out.println(threadName +" : "+Shared.count);
					Thread.sleep(10);
				}
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(threadName+" releases the permit");
			sem.release();
		}
		else {
			System.out.println("Starting "+threadName);
			try {
				System.out.println(threadName +" waiting for the permit");
				sem.acquire();
				System.out.println(threadName+" gets a permit ");
				
				for(int i=0;i<5;i++) {
					Shared.count--;
					System.out.println(threadName +" : "+Shared.count);
					Thread.sleep(10);
				}
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(threadName+" relaeses the permit");
			sem.release();
		}
		
	}
}

public class SemaphoreDemo {
	public static void main(String[]args)  throws InterruptedException {
		Semaphore sem = new Semaphore(1);
		
		MyThread obj1  =new MyThread(sem,"A");
		MyThread obj2 = new MyThread(sem,"B");
		
		obj1.start();
		obj2.start();
		
		obj1.join();
		obj2.join();
		
	System.out.println("count "+ Shared.count);
		
	}
}
