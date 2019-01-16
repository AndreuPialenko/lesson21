package Philosops;

import java.util.concurrent.Semaphore;

public class Philosophor extends Thread {
    Semaphore sem;
    int number = 1;
    int id;

    public Philosophor(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    public void run(){
        try {
            while (number <3 ){
                sem.acquire();
                System.out.println("Филосов " + id + " садится за стол");
                Thread.sleep(500);
                number++;
                System.out.println("Филосов " + id + " выходит из-за стола");
                sem.release();
                Thread.sleep(500);
            }

        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}


