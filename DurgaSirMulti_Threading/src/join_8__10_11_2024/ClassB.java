package join_8__10_11_2024;

class MyThread extends Thread {
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

public class ClassB {
    public static void main(String[] args) throws InterruptedException {
        MyThread a = new MyThread();
        a.start();


        a.join(); // main thread give the chance child thread to completed your task or execution
//		a.join(2000);// main thread give the specific time to child thread to complete your task/execution
//		a.join(1000, 00); // main thread give the specific time to child thread to complete your task/execution
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Main Thread");
        }

    }
}
