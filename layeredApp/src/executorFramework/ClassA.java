package executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassA {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running." + Thread.currentThread().getName());
                // Simulate some work
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " is completed.");
                System.out.println();
            });
        }

        executor.shutdown(); // Initiates an orderly shutdown
    }
}


