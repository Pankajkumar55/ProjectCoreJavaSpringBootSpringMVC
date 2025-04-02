package join_11__11_11_2024;

public class ClassA extends Thread {
    static Thread mt;

    public void run() {
        try {
            System.out.println("ClassA Child Thread execution Start");
            System.out.println(mt.getName());
            mt.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " child Thread");

        }

    }
}
