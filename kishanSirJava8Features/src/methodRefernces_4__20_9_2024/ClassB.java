package methodRefernces_4__20_9_2024;

public class ClassB {
    public static void main(String[] args) {
        new ClassB().test();
    }

    void test() {

        System.out.println("implementing method referencing");

        InterfaceA i1 = new Employe()::display; // non static method referencing

        InterfaceA i2 = Employe::show; // static method referencing

        InterfaceA i3 = Employe::new; // constructor called
        i3.meth1();

    }
}
