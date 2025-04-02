package overloadRunMethod_2__9_11_2024;

public class ClassA extends Thread {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Main method called");
        }
        // a.run(50);
        a.start();

    }

    public void run() {

        for (int i = 0; i < 5; i++)
            System.out.println(i + " run method called without arguement");
    }

    public void run(int i) { // This is considered just a normal method if we pass any
        // argument then run method considered just a normal method
        for (int p = 0; i < 5; i++) {
            System.out.println(p + " run method called with argument");
        }

    }
}
