package MultiThreading;

public class AnonymouswithMultiThreads {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello world");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};
		Runnable obj2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Welcome coding");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};
		obj1.run();
		obj2.run();
	}

}
