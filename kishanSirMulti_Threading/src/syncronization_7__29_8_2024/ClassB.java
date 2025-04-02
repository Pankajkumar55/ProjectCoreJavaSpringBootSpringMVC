package syncronization_7__29_8_2024;

public class ClassB extends Thread {
    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        Thread t1 = new Thread(bobj);
        Thread t2 = new Thread(bobj);

        t1.setName("First-Thread");
        t2.setName("Second-Thread");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started Executing run()");
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " ====>" + i);
            }
        }
        System.out.println(name + " completed its execution");
    }

}
