package org.example.priority;

import java.util.concurrent.TimeUnit;

public class WalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Walk  " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("end of WalkThread");
            }
        }
    }
}
