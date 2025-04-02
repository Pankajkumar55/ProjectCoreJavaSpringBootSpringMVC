package pack1;

class ClassB {

    public static void meth1() {
        System.out.println("classB");
    }

    void meth2() {
        System.out.println("ClassB");
    }

}

public class ClassA extends ClassB {

    public static void meth1() {
        System.out.println("classA");
    }

    public static void main(String[] args) {

        ClassB c = new ClassA();
        c.meth1();
        c.meth2();

    }

    void meth2() {
        System.out.println("ClassA");
    }
}
