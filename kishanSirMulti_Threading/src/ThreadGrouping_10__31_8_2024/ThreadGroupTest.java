package ThreadGrouping_10__31_8_2024;

public class ThreadGroupTest implements Runnable {
    public static void main(String[] args) {
        ThreadGroupTest robj = new ThreadGroupTest(); // Class Object
        ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
        Thread t1 = new Thread(tg, robj, "one");
        t1.start();

        Thread t2 = new Thread(tg, robj, "two");
        t2.start();

        Thread t3 = new Thread(tg, robj, "three");
        t3.start();

        System.out.println("Thread Group Name : " + tg.getName());
        System.out.println("Active Threads : " + tg.activeCount());

        tg.setMaxPriority(10);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

    }
}
