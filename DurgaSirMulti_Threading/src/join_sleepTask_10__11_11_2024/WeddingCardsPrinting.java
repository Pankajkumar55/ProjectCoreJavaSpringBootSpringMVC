package join_sleepTask_10__11_11_2024;

public class WeddingCardsPrinting extends Thread {
    public void run() {
        System.out.println("Card Printing Start");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " CardPrint");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Card Printing End\n");
    }
}
