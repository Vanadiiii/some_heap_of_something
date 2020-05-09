package stack_over_flow;

import java.util.concurrent.TimeUnit;

class Incremenator extends Thread {
    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    public void finish() {
        mFinish = true;
    }

    @Override
    public void run() {
        while (!mFinish) {
            if (mIsIncrement) Program.mValue++;
            else Program.mValue--;
            System.out.print(Program.mValue + " ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
