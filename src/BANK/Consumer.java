package BANK;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Integer> queue;

	@Override
	public void run() {
		try {
			while (true) {
				Integer take = queue.take();
				process(take);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

	public void process(Integer take) throws InterruptedException {
		System.out.println("Consumer Remove " + take);
		Thread.sleep(500);
	}

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;

	}
}
