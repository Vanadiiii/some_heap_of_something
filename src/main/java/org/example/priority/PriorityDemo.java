package org.example.priority;

public class PriorityDemo {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        Thread talk = new Thread(new TalkThread());
        talk.setPriority(Thread.MIN_PRIORITY);
        walk.setPriority(Thread.MAX_PRIORITY);
        talk.start();
        walk.start();
    }
}
