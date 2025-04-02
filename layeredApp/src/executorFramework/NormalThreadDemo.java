package executorFramework;

public class NormalThreadDemo {


    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getPriority());
            }
        });

        thread.start();
        thread.setPriority(8);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(thread.getState());

        for (int i = 0; i < 1; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());

        }
      //  Thread.currentThread().setPriority(10);
        System.out.println(" main " +Thread.currentThread().getPriority());

    }


}

