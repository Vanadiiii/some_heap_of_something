package org.example.synchronizeds;

import java.util.concurrent.TimeUnit;

public class SynchroBlockMain {
    static int counter;

    public static void main(String[] args) {
        StringBuilder info = new StringBuilder();
        Thread thread1 = new Thread(() -> {
            synchronized (info) {
                do {
                    info.append('A');
                    System.out.println(info);
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (counter++ < 2);
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (info) {
                while (counter++ < 6) {
                    info.append('B');
                    System.out.println(info);
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            synchronized (info) {
                while (counter++ < 9) {
                    info.append('С');
                    System.out.println(info);
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
