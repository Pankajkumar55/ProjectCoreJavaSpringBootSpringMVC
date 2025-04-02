package creatingThread_1__9_11_2024;

public class ClassA extends Thread {

    public static void main(String[] args) {
        ClassA a = new ClassA();

        // a.run(); // Just a called like a normal method
        //
        a.start(); // it's called thread class run method

        a.meth1();
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " child thread called");
        }

    }

    void meth1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " meth1() called");
        }
    }

}
