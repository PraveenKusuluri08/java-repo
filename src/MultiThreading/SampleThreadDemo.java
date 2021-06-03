package MultiThreading;

class MultiThread implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello world");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class welcomeCoding implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Welcome coding");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class SampleThreadDemo {

	public static void main(String[] args) {
		Runnable obj1 = new MultiThread();
		Runnable obj2 = new welcomeCoding();

		Thread obj3 = new Thread(obj1);
		Thread obj4 = new Thread(obj2);
		
		obj3.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		obj4.start();
	}

}
