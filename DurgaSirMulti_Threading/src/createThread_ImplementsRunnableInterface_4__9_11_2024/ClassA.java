package createThread_ImplementsRunnableInterface_4__9_11_2024;

public class ClassA implements Runnable {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        Thread t = new Thread(a); // Target Runnable
        t.start();

        for (int p = 0; p < 6; p++) {

            System.out.println(p + " main method called");
        }
    }

    public void run() {
        for (int i = 0; i < 16; i++) {

            System.out.println(i + " run method called");
        }
    }
}

