package stack_over_flow;

import java.util.concurrent.TimeUnit;

public class Program {
    public static int mValue = 0;

    static Incremenator mInc;

    public static void main(String[] args) {
        mInc = new Incremenator();
        System.out.print("Значение = " + mValue + " ");
        mInc.start();

        for (int i = 1; i <= 3; i++) {
            try {
                TimeUnit.SECONDS.sleep(i*2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mInc.changeAction();
        }
        mInc.finish();
    }
}
