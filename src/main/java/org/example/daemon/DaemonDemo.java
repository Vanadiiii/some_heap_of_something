package org.example.daemon;

import org.example.priority.TalkThread;
import org.example.priority.WalkThread;

public class DaemonDemo {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        Thread talk = new Thread(new TalkThread());
        talk.setDaemon(true);
        walk.setPriority(Thread.MAX_PRIORITY);
        talk.setPriority(Thread.MIN_PRIORITY);
        talk.start();
        walk.start();
        System.out.println("end of main");
    }
}
