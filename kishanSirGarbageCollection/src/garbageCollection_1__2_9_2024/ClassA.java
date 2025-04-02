package garbageCollection_1__2_9_2024;

public class ClassA {

    public static void main(String[] args) {
        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();

        a1.meth1();
        // a1=null;
        // a1=a2;

        System.gc();

    }

    public void meth1() {
        System.out.println("meth1() called");
        ClassA a = new ClassA();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collter called");
    }
}
