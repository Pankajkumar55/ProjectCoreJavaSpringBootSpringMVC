package saticInnerClass_9__25_9_2024;

public class OuterClass {

    static int y = 20; // static

    static {
        System.out.println("outer class static block");
    }

    int x = 10; // instance

    {
        System.out.println("outer class insatance block");
    }

    public OuterClass() {
        System.out.println("Outer class constructore");

    }

    public static void main(String[] args) {
        OuterClass.InnerClass iobj = new OuterClass.InnerClass();
        iobj.show();
    }

    static class InnerClass {
        static {
            System.out.println("inner class static block");
        }

        {
            System.out.println("inner class instance block");
        }

        public InnerClass() {
            System.out.println("inner class constructor");

        }

        public static void main(String[] args) {
            new InnerClass().show();
        }

        void show() {
            System.out.println("inner class method");
            System.out.println("outer class Instance variable : " + new OuterClass().x);
            System.out.println("outer class static variable : " + y);
        }

    }
}
