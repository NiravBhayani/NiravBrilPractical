package Day8.Assignment2;

public class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5000; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ":" + i);
            if (i % 75 == 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
