package org.example.exceptions;

import java.util.concurrent.TimeUnit;

public class ThreadException {
    public static void main(String[] args) {
        new Thread(() -> {
//            boolean flag = true;
//            if (flag) {
//                throw new RuntimeException();
//            }
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End of ExceptThread");
        }, "excThread"
        ).start();
        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(Boolean.TRUE) throw new RuntimeException();
        System.out.println("end of main");
    }
}
