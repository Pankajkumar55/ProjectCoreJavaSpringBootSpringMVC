package method_4__17_6_2024;

public class ClassD {
    public static void main(String[] args) {
        // ClassD d =new ClassD();
        System.out.println(new ClassD().meth2(10, new ClassD().meth1(50)));
    }

    int meth1(int x) {
        System.out.println("meth1");
        return x;
    }

    int meth2(int a, int b) {
        return a + b;
    }
}
