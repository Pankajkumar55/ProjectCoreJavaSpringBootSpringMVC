package yield_7__10_11_2024;

public class ClassA extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            Thread.yield();
            System.out.println(i + " Child Thred");

        }
    }

}
