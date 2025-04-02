package method_3__15_6_2024;

public class ClassC {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        int i = c.meth1();
        c.meth2(i);
        System.out.println("------same output-------");
        c.meth2(c.meth1());
    }

    int meth1() {
        System.out.println("hi");
        return 100;

    }

    void meth2(int x) {
        System.out.println("hello : " + x);
    }
}