package join_11__11_11_2024;

public class ClassB {
    public static void main(String[] args) throws InterruptedException {
        ClassA.mt = Thread.currentThread();
        ClassA a = new ClassA();

        a.start();
        //	a.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " main Thread");
            Thread.sleep(1000);
        }
    }
}
