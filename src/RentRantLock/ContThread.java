package RentRantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ContThread  implements Runnable{
    CommonResource res;
    ReentrantLock locker;

    public ContThread(CommonResource res, ReentrantLock locker) {
        this.res = res;
        this.locker = locker;
    }
    public void run(){
        try {
            locker.lock();
            res.x=1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);

            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }
}
}
