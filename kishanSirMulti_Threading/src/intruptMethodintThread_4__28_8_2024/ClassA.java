package intruptMethodintThread_4__28_8_2024;

public class ClassA extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ClassA aobj = new ClassA();
        Thread t = new Thread(aobj);
        t.start();
        Thread.sleep(5000);
        t.interrupt();

    }

    public void run() {
        System.out.println("I am ready for Interviews\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is my " + i + " Interviews");
        }
        try {
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println("\nMy sleep got distrubed");
        }
        System.out.println("I got placed So i can relax");
    }
}
