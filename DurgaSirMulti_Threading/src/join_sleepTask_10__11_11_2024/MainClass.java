package join_sleepTask_10__11_11_2024;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        VenuFixing vf = new VenuFixing();
        vf.start();
        vf.join();

        WeddingCardsPrinting wp = new WeddingCardsPrinting();
        wp.start();
        wp.join();

        WeddingCardsDistribution wd = new WeddingCardsDistribution();
        wd.start();
        wd.join();

    }

}
