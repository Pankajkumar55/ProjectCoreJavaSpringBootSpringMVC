package method_3__15_6_2024;

public class ClassB {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        System.out.println(1);

        classB.display();

        System.out.println(classB.display() + 1);
    }

    int display() {
        System.out.println("hello");
        return 99;
    }
}
