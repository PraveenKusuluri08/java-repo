package BANK;
import java.util.concurrent.*;
import java.util.Scanner;

public class Banker {
	public static void main(String[]args) {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
	
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}
}
