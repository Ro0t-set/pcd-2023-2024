package pcd.lab04.sem.ex;

import java.util.concurrent.Semaphore;

public class Ponger extends Thread {

	private Semaphore mutex;

	public Ponger(Semaphore mutex) {
		this.mutex = mutex;
	}	
	
	public void run() {
		while (true) {
			try {
				mutex.acquire();
				System.out.println("pong!");
				mutex.release();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}