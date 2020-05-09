package java_rush;

public class ThreadExample extends Thread{
    public ThreadExample() {
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " уступает своё место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished execution");
    }

    public static void main(String[] args) {
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
    }
}
