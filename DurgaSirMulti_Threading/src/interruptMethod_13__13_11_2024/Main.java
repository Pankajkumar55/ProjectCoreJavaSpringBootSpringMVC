package interruptMethod_13__13_11_2024;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " : m Lazy Thread");

        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.err.println("I got Interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        mt.interrupt(); // If child Thread will go to sleep mode for (1 or more Minutes) Then interrupt
        // method called by JVM
        for (int i = 0; i < 2000; i++) {
            System.out.println(i + " Main Thread called");
        }
    }
}
