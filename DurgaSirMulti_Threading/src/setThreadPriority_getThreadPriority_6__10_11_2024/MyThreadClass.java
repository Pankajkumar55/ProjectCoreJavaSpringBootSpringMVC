package setThreadPriority_getThreadPriority_6__10_11_2024;

public class MyThreadClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
