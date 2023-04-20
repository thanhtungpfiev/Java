package my_thread;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top of the stack");
    }

}

class ThreadTester {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
        System.out.println("back in main");
    }
}
