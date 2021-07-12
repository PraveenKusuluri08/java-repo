package InterThreadJava;


//thread begins its life in run method
class MyThread extends Thread {
	public void run() {
		try {
			System.out.println("Thread begains its execution " + Thread.currentThread().getId());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

public class InterThread {
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<12;i++) {
			Thread thread = new Thread(new MyThread());
			thread.start();
		}
		MyThread.sleep(1000);
	}
}
