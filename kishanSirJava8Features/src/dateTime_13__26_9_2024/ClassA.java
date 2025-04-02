package dateTime_13__26_9_2024;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ClassA {
    public static void main(String[] args) {

        new ClassA().meth2();
        // new ClassA().meth1();
    }

    void meth1() {
        for (String s : ZoneId.getAvailableZoneIds())
            System.out.println(s);

        // System.out.println(ZoneId.getAvailableZoneIds().size());
    }

    void meth2() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now(ZoneId.of("US/Samoa")));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:a");

        String ampm = LocalTime.now().format(dtf);
        System.out.println("====>" + ampm);

    }
}
