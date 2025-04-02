package join_11__11_11_2024;

public class Test extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        Test test = new Test();
        Test test2 = new Test();
        t.start();


        test.start();
        test.join();

        test2.start();
    }

    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 0; i < 6; i++) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
