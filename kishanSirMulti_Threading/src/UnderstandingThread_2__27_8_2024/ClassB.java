package UnderstandingThread_2__27_8_2024;

public class ClassB extends Thread {

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        Thread t1 = new Thread(bobj);
        Thread t2 = new Thread(bobj);

        t1.setName("First-Thread");
        t2.setName("Second-Thread");

        t1.setPriority(1); // t1.setPriority(MIN_PRIORITY);
        t2.setPriority(10); // t1.setPriority(MAX_PRIORITY);

        t1.start();
        t2.start();

    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        for (int i = 0; i < 5; i++) {
            System.out.println(name + "(" + priority + ")" + "has executed run() : " + i);
        }
    }
}


