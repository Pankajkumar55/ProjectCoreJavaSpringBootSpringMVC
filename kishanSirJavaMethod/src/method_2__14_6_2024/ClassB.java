package method_2__14_6_2024;

public class ClassB {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth1();
        System.out.println("-----------------");
        b.meth2();
    }

    void meth1() {
        System.out.println("meth1() called");
        int i = 10;
        System.out.println("i");
        System.out.println(i);
        System.out.println('x');
        System.out.println("xyz");
    }

    void meth2() {
        System.out.println("meth(2) called");
        int a = 10;
        System.out.println(a + 90);
        System.out.println("a+90");
        System.out.println("Addition : " + (a + 90));
        System.out.println("a value : " + a);

    }
}
