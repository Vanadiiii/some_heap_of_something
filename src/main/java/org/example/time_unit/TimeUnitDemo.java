package org.example.time_unit;

import java.util.concurrent.TimeUnit;

public class TimeUnitDemo {
    public static void main(String[] args) {
        long timeoutDays = TimeUnit.HOURS.toMinutes(1);
        System.out.println(timeoutDays);
//        try {
//            long timeout = 1;
//            TimeUnit.MINUTES.sleep(timeout);
//            System.out.println("hello after " + timeout + " minutes");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
