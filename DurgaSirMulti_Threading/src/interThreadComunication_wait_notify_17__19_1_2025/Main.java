package interThreadComunication_wait_notify_17__19_1_2025;

class ChildThread extends Thread {
    int total = 0;

    public void run() {

        for (int i = 0; i <= 100; i++) {
            total = total + i;

        }
        synchronized (this) {
            System.out.println("Child Thread complete your task");
            System.out.println("Child Thread notify to main Thread");
            this.notify(); // Child Thread Complete your Task and update to Main Thread
        }

    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChildThread c = new ChildThread();
        c.start();

        synchronized (c) {
            System.out.println("Main Thread calling wait method");
            c.wait(); // Main Thread call wait method and wait for notification (notify()) by Child
            // Thread

            System.out.println("Main Thread got notification");
            System.out.println(c.total);

        }
    }
}
