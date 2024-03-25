package pcd.lab04.sem.ex;
import java.util.concurrent.Semaphore;

public class Pinger extends Thread {

	private Semaphore mutex;

	public Pinger(Semaphore mutex) {
		this.mutex = mutex;
	}	
	
	public void run() {
		while (true) {
			try {
				mutex.acquire();
				System.out.println("ping!");
				mutex.release();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}