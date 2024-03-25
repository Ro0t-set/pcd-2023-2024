package pcd.lab05.monitors.ex_barrier;

public class RealBarrier implements Barrier{
    private final int nParticipants;
    private int arrived = 0;
    private boolean canPass = false;

    public RealBarrier(int nParticipants){
        this.nParticipants = nParticipants;
    }

    @Override
    public synchronized void hitAndWaitAll() throws InterruptedException {
        arrived++;
        if (arrived == nParticipants){
            canPass = true;
            notifyAll();
        }
        else{
            while (!canPass){
                wait();
            }
        }
    }
}
