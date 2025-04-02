package syncronization_7__29_8_2024;

public class ClassA extends Thread {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        Thread t = new Thread(aobj);
        Thread t2 = new Thread(aobj);

        t.start();
        t2.start();

    }

    @Override
    public void run() {

    }

    synchronized void criticalResource() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " has entered CriticalResource");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " ==> " + i);
        }
        System.out.println(name + " completed its execution");
    }
}
