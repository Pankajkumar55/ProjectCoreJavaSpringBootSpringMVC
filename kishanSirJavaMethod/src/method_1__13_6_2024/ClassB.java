package method_1__13_6_2024;

public class ClassB {
    public static void main(String[] args) {
        System.out.println("Start");
        ClassB b = new ClassB(); // Creating a object
        b.msg(); // Calling a method
        b.display(); // Calling a method
        System.out.println("java is awesome");

    }

    public void msg() {
        System.out.println("hello world");

    }

    private void display() {
        System.out.println("Today is wednesday");
    }
}