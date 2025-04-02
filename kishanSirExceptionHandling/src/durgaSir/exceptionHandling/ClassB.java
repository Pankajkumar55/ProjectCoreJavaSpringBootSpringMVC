package durgaSir.exceptionHandling;

public class ClassB {
    public static void main(String[] args) {
        new ClassB().meth1();
    }

    void meth1() {
        System.out.println("meth1() called");
        new ClassB().meth2();

    }

    void meth2() {
        System.out.println("meth2() called");
        new ClassB().meth3();
    }

    void meth3() {
        System.out.println("meth3() called");
        new ClassB().meth4();

    }

    void meth4() {
        System.out.println("meth4() called");
        System.out.println(10 / 0);

    }
}
