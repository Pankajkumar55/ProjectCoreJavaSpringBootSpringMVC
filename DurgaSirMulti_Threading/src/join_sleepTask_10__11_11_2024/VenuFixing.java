package join_sleepTask_10__11_11_2024;

import java.time.LocalTime;

public class VenuFixing extends Thread {
    public void run() {

        String ldt = LocalTime.now().toString();
        System.out.println("VenueFixingStart " + ldt);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("VenueFixingEnd " + ldt + "\n");

    }
}
