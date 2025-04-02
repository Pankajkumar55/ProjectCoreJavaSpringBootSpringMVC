package createThread_1__26_4_2024;

public class ClassB implements Runnable {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        Thread t = new Thread(b);
        t.start();

    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
    }
}
