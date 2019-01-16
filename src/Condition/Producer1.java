package Condition;

public class Producer1 implements Runnable{
    Store store;

    public Producer1(Store store) {
        this.store = store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
