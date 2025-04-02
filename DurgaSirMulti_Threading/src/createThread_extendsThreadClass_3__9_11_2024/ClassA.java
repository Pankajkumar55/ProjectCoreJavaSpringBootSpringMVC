package createThread_extendsThreadClass_3__9_11_2024;

public class ClassA extends Thread {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.start();    // just a normal method not Thread class start method

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " run() method called");
        }

    }

    public void start() {
        System.out.println("start() called");
        super.start(); // called Thread Class start method
    }
}

/*
 *
 * if we will override start method then our start method will be executed just a
 * normal method called and new Thread won't be created
 * */