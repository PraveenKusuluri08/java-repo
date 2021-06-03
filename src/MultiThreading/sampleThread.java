package MultiThreading;

class MultiThread extends Thread {

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

class welcomeCoding extends MultiThread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Welcome coding");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class sampleThread {

	public static void main(String[] args) {

		MultiThread obj1 = new MultiThread();
		welcomeCoding obj2 = new welcomeCoding();

		obj1.start();
		obj2.start();
	}

}
