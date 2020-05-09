package java_rush.philosopher_lanch;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Philosopher extends Thread {
    private Semaphore semaphore;

    private boolean full = false;
    private String name;

    Philosopher(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            if (!full) {
                semaphore.acquire();
                System.out.println(name + " садится за стол");
                TimeUnit.MILLISECONDS.sleep(300);
                full = true;
                System.out.println(name + " поел. Он выходит из-за стола");
                semaphore.release();
                TimeUnit.MILLISECONDS.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
