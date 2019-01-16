package Condition;

public class ThreadsApp1 {
    public static void main(String[] args) {
        Store store = new Store();
        Producer1 producer = new Producer1(store);
        Consumer1 consumer = new Consumer1(store);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
