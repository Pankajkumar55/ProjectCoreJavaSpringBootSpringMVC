package createThread_1__26_4_2024;

public class ClassA extends Thread {

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        Thread t = new Thread(aobj);
        t.start();

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}