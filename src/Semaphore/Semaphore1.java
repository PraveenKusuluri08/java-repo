package Semaphore;
import java.util.concurrent.*;
import java.util.*;
class Permisson{
	static int count=0;
}

class MyDemo extends Thread{
	Semaphore sem;
	String threadName;
	public MyDemo(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}
	public void run() {
		if(this.threadName.equals("A")) {
			System.out.println(threadName+" is Starting");
			try{
				System.out.println(threadName+" requesting the permission");
				sem.acquire();
				System.out.println(threadName+" gets permission");
				
				List<Integer> lt = new ArrayList<>();
				lt.add(10);
				lt.add(20);
				lt.add(30);
				lt.add(40);
				
				Iterator<Integer> it = lt.iterator();
				while(it.hasNext()) {
					System.out.println("Elements are in the list "+it.next());
				}
				for(int i=0;i<5;i++) {
					Permisson.count--;
					System.out.println(threadName +" : "+Permisson.count);
					Thread.sleep(10);
				}
			}catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
			System.out.println(threadName+" is going to  releases");
			sem.release();
		}
		else {
			System.out.println(threadName+" is Starting");
			try {
				System.out.println(threadName+" is waiting for the permission ");
				sem.acquire();
				System.out.println(threadName +" is gets the permission");
				
				for(int i=0;i<5;i++) {
					Permisson.count++;
					System.out.println(threadName+" : "+ Permisson.count);
					Thread.sleep(10);
				}
			}catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
			System.out.println(threadName+" is going to release");
			sem.release();
		}
	}
	
}

public class Semaphore1 {

	public static void main(String[] args) throws InterruptedException {
		Semaphore sem = new Semaphore(2);
		MyDemo t1=new MyDemo(sem,"A");
		MyDemo t2=new MyDemo(sem,"B");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("No mre permissions are left");
		
	}

}
