package method_2__14_6_2024;

public class ClassC {
    public static void main(String[] args) {
        System.out.println("Start");
        ClassC c = new ClassC();
        c.meth3();
        System.out.println("End");
    }

    void meth1() {
        ClassC c = new ClassC();
        c.meth5();
        int a = 10;
        System.out.println(10);
        System.out.println(54 + a);

    }

    void meth2() {
        int a = 20;
        System.out.println(78 - a);

    }

    void meth3() {
        int a = 30;
        ClassC c = new ClassC();
        System.out.println(89 + 1);
        c.meth1();
        System.out.println(10);
        System.out.println(a);
    }

    void meth4() {
        int a = 10;
        System.out.println(89);
        System.out.println(85);
        System.out.println(44);
        System.out.println(a);

    }

    void meth5() {
        System.out.println(77);
        ClassC c = new ClassC();
        c.meth2();
        System.out.println(99);

    }
}
