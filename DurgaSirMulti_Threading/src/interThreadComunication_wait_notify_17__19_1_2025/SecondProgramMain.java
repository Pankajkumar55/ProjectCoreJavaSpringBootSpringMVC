package interThreadComunication_wait_notify_17__19_1_2025;

class ChidThread extends Thread {
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

public class SecondProgramMain {
    public static void main(String[] args) throws InterruptedException {
        ChidThread c = new ChidThread();
        c.start();
        Thread.sleep(10000);
        /*
         *
         * case 1: if Main Thread is going to sleep for 10 seconds in this time child
         * thread complete your task and then notify and dead and after child thread
         * dead then also main thread is sleeping and when main thread wake-up and go to
         * again running then wait for notify() method in child thread and child thread
         * is dead so main thread waiting and only waiting.
         *
         * case 1: in this case we'll use wait() overloaded method so wait(int
         * miliSeconds) method wait for some time after some time he will continue for
         * your execution.
         *
         */

        synchronized (c) {
            System.out.println("Main Thread calling wait method");
            c.wait(); // Main Thread call wait method and wait for notification (notify()) by Child
            // Thread

            System.out.println("Main Thread got notification");
            System.out.println(c.total);

        }
    }
}
