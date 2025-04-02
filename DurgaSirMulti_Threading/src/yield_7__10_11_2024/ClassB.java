package yield_7__10_11_2024;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " main Thread");
        }
    }
}
