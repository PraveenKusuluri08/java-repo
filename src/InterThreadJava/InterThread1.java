package InterThreadJava;

class B {
	int num;
	boolean bool = false;
	public synchronized void setNum(int num) {
		while(bool) {
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
		this.num = num;
		System.out.println("PUT " + num);
		bool=true;
	}

	public synchronized int get() {
		while(!bool) {
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
		return num;
//		bool = false;
//		notify();
	}
}

class Provider1 implements Runnable {
	B b;

	Provider1(B b) {
		this.b = b;
		System.out.println(this);
		Thread t1 = new Thread(this, "Provider");
		t1.start();
	}

	public void run() {
		for (int i = 0;; i++) {
			b.setNum(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Consumer1 implements Runnable{
	B b;
	Consumer1(B b){
		this.b =b;
		Thread t2 = new Thread(this,"consumer");
		t2.start();
	}
	public void run() {
		for(int i=0;;i++) {
		 System.out.println("GET "+b.num);	;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}

public class InterThread1 {

	public static void main(String[] args) {
		B bj = new B();
		new Provider1(bj);
		new Consumer1(bj);
	}

}
