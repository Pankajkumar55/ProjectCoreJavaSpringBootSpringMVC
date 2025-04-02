package understandingInterfaceMethodCalled__18_9_2024;

public class ClassA {
    static InterfaceA display() {
        System.out.println("I am from ConnectionPooling");

        return new InterfaceA() {
            public void meth1() {
                System.out.println("InterfaceA meth1() overriden");
            }

            public void meth2() {
                System.out.println("InterfaceA meth2() overriden");
            }
        };
    }
}
