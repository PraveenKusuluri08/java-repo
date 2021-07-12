package InterThreadJava;
import java.util.*;

class PC{
	public void producer() throws InterruptedException{
		//synchronized block ensures only one thread 
		//runs only one time 
		synchronized(this) {
			System.out.println("Producer thread is Running " );
			wait();
			System.out.println("Resumed");
		}
	}
	//sleeps for some time until the key is pressed after key is pressed it notifies and produce
	public void consumer() throws InterruptedException {
		Thread.sleep(1000);
		Scanner scan = new Scanner(System.in);
		synchronized(this) {
			System.out.println("Waiting for the key to produce");
			scan.nextLine();
			System.out.println("Key is pressed");
			notify();
			Thread.sleep(2000);
		}
	}
}

public class Communication {

	public static void main(String[] args) throws InterruptedException{
		
		final PC obj = new PC();
	Thread t1 = new Thread(new Runnable)
		
	}
	

}
