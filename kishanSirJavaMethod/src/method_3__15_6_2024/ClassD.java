package method_3__15_6_2024;

public class ClassD {
    public static void main(String[] args) {
        ClassD d = new ClassD();
        System.out.println("START");
        int result = d.meth4(20, 10);
        System.out.println(result);
        d.meth1();
    }

    void meth1() {
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }

    int meth2(int a, int b, int c) {
        System.out.println(a);
        ClassD d = new ClassD();
        String s = d.meth5(100, "java is awesome");
        System.out.println(s);
        return a - b;
    }

    String meth3(String s, int b, int d) {
        System.out.println(b + d);
        return s;

    }

    int meth4(int c, int k) {
        System.out.println(k);
        ClassD d = new ClassD();
        int result = d.meth2(50, 50, 50);
        System.out.println(result);
        return k + 10;

    }

    String meth5(int a, String L) {
        System.out.println(a + a);
        ClassD d = new ClassD();
        String s = d.meth3("Hi", 15, 10);
        System.out.println(s);
        return L;

    }

}
