package pcd.lab02.lost_updates;

public class UnsafeCounter {

	private int cont;
	private Object lock;
	
	public UnsafeCounter(int base, Object lock){
		this.cont = base;
		this.lock = lock;
	}
	
	public void inc(){
		synchronized(lock){
			cont++;
		}
	}
	
	public int getValue(){
		return cont;
	}
}
