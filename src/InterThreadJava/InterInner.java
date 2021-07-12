package InterThreadJava;

class Q {
	int num;
	boolean count = false;

	public synchronized void put(int num) {
		while (count) {
			try {
				wait();
			} catch (Exception e) {

			}
		}

		System.out.println("PUT " + num);
		this.num = num;
		count = true;
	}

	public synchronized void get() {
		while (!count) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		System.out.println("GET " + num);
//		return num;
		count = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this);
		t1.start();
	}

	public void run() {
		for (int i = 0; i <= 1000; i++) {
			q.put(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}

class Consumer implements Runnable {
	Q q;

	Consumer(Q q) {
		this.q = q;
		Thread t2 = new Thread(this, "consumer");
		t2.start();
	}

	public void run() {
		for (int i = 0; i <= 1000; i++) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}
}

class InterInner {
	public static void main(String[] args) {
		Q obj = new Q();
		new Producer(obj);
		new Consumer(obj);

	}
}