package joinMethodinThread_5__28_8_2024;

public class ClassA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ClassA : " + i);
        }
    }

}
