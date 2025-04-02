package sleepMethodinThread_6__28_8_2024;

public class ClassA extends Thread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("j");
        Thread.sleep(5000);
        System.out.println("a");
        Thread.sleep(5000);
        System.out.println("v");
        Thread.sleep(5000);
        System.out.println("a");
        ClassA a = new ClassA();
        Thread t = new Thread(a);
        t.start();

    }
}
