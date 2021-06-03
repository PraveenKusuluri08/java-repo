package MultiThreading;

public class LambdaMultiThread2 {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello world");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Welcome coding");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		try {

			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.MIN_PRIORITY);
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(t2.getPriority());
		t1.start();

		
		
		try {
			Thread.sleep(10);
		} catch (Exception e) {

		}
		t2.start();

		t1.join();
		t2.join();

		System.out.println("hi");
	}

}
