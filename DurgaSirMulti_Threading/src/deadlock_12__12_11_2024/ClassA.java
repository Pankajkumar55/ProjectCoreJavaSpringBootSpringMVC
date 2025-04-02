package deadlock_12__12_11_2024;

public class ClassA {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Main method");

        Thread.currentThread().join(); // main Thread stuck because its waiting for other Thread execution

        System.out.println("End Main method");

    }
}
