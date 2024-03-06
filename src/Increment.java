public class Increment extends Thread{
    private Counter counter;
    private int incrementsThread;
    public Increment(Counter counter, int incrementsThread){
        this.counter=counter;
        this.incrementsThread=incrementsThread;
    }

    @Override
    public void run() {
        for(int i=0; i<incrementsThread; i++){
            try {
                counter.increment();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
