package join_sleepTask_10__11_11_2024;

public class WeddingCardsDistribution extends Thread {
    public void run() {

        System.out.println("Wedding Card Distribution Start");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " Card Distribueted");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
        System.out.println("Wedding Card Distribution End\n");
    }
}
