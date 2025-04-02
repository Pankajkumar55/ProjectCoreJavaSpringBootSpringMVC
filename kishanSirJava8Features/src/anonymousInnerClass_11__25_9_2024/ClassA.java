package anonymousInnerClass_11__25_9_2024;

public class ClassA {
    public static void main(String[] args) {
        ClassA aobj = new ClassA() {
            @Override
            void meth1() {
                System.out.println("anonymous meth1 called");
                super.meth1();
                super.meth2();
            }
        };
        aobj.meth1();
    }

    void meth1() {
        System.out.println("meth1() called");

    }

    void meth2() {
        System.out.println("meth2() called");
    }
}
