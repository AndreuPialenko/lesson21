package Condition;

public class Consumer1 implements Runnable {

    Store store;

    public Consumer1(Store store) {
        this.store = store;
    }

    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}
