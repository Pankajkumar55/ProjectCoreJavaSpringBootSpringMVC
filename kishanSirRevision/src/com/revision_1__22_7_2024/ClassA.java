package com.revision_1__22_7_2024;

public class ClassA {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });
        thread.start();
        Thread.sleep(1000);
    }
}
