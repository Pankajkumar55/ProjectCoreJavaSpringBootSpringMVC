package setThreadName_getThreadName_5__9_11_2024;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " run() called");
        }

    }
}
