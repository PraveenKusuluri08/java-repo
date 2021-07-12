package BANK;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Integer> queue;

	public void run() {
		try {
			process();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void process() throws InterruptedException {
		for (int i = 0; i < 12; i++) {
			System.out.println("Producer Add " + i);
			queue.put(i);
			System.out.println("Queues Remaining Capacity " + queue.remainingCapacity());
			Thread.sleep(150);
		}

	}

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

}
