package pcd.lab04.sem.ex;
import java.util.concurrent.Semaphore;

/**
 * Unsynchronized version
 * 
 * @TODO make it sync 
 * @author aricci
 *
 */
public class TestPingPong {
	public static void main(String[] args) {
		Semaphore mutex = new Semaphore(1,true);
		new Pinger(mutex).start();
		new Ponger(mutex).start();	
	}

}
