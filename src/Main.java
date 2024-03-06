public class Main {
    public static void main(String[] args) {
        Counter counter= new Counter();
        int num=6;
        int increment=5;
        Increment[] threads= new Increment[num];
        for(int i=0; i<num ; i++){
            threads[i]= new Increment(counter,increment);
            threads[i].run();
        }
        try {
            for(Increment thread:threads){
                thread.join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final count: "+counter.getCount());
    }
}