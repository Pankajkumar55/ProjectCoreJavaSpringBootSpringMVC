package joinMethodinThread_5__28_8_2024;

public class ClassB {
    public static void main(String[] args) throws InterruptedException {
        ClassA aobj = new ClassA();
        aobj.start();
        aobj.join();
        for (int i = 0; i <= 5; i++) {
            System.out.println("ClassB : " + i);
        }

    }

}
