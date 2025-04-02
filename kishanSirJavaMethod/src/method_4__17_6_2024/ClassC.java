package method_4__17_6_2024;

public class ClassC {
    public static void main(String[] args) {
        System.out.println(new ClassC().meth5(new ClassC().meth3(15, 25, new ClassC().meth2(500))));
    }

    int meth1(int a, int b) {
        System.out.println(a);
        System.out.println(a - b);
        return new ClassC().meth4(a - 1, "Hii");
    }

    String meth2(int x) {
        System.out.println(x - new ClassC().meth1(200, 199));
        System.out.println(x);
        return "java";
    }

    String meth3(int a, int b, String s) {
        System.out.println(a);
        System.out.println(a + a);
        System.out.println(a + b);
        return s;
    }

    int meth4(int a, String s) {
        System.out.println(a);
        System.out.println(s);
        return 20;
    }

    String meth5(String s) {
        return s;
    }
}
