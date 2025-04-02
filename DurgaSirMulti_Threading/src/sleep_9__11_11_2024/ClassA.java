package sleep_9__11_11_2024;

public class ClassA extends Thread {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.start();

    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
