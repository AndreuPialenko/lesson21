package Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private int product = 0;
    ReentrantLock locker;
    Condition condition;

    public Store() {
        this.locker = new ReentrantLock();
        this.condition = locker.newCondition();
    }

    public void put(){
        try {
            locker.lock();
            while (product>=3) {
                condition.await();
            }

            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товар на складе: " + product);

            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }
    }

    public void get(){
        try {
            locker.lock();
            while (product <1)
                condition.await();
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товар на складе: " + product);

            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }
    }
}
