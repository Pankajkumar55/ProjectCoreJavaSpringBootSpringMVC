package nestedInnerClass_8__25_9_2024;

public class OuterClass {
    static {
        System.out.println("Outer class static block");
    }

    {
        System.out.println("Outer class instance block");
    }

    public OuterClass() {
        System.out.println("Outer class constructor");
    }

    public static void main(String[] args) {
        OuterClass.InnerClassA iobj = new OuterClass().new InnerClassA();
        iobj.show();
    }

    private void meth1() {
        System.out.println("Outer Class meth1()");
    }

    class InnerClassA {

        static {
            System.out.println("Inner class static block");
        }

        {
            System.out.println("Inner class Insatance block");
        }

        void show() {
            System.out.println("Inner class method");
            meth1();
        }

    }
}
