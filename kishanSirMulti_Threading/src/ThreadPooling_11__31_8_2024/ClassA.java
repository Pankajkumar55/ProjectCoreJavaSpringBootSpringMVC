package ThreadPooling_11__31_8_2024;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassA {

    private String msg;

    public ClassA(String s) {
        this.msg = s;

    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(() -> System.out.println());
        for (int i = 1; i < 5; i++) {

        }

    }

    synchronized public void run() {
        System.out.println(Thread.currentThread().getName() + " (Begining) message = " + msg);
        processMessage();

    }

    private void processMessage() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
