package understandingInterfaceMethodCalled__18_9_2024;

public class ClassB {
    public static void main(String[] args) {
        System.out.println("ClassB main()");

        InterfaceA aobj = ClassA.display();

        aobj.meth1();
        aobj.meth2();
    }
}
