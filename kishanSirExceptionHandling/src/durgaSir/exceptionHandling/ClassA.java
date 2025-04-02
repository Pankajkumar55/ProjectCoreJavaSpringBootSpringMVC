package durgaSir.exceptionHandling;

public class ClassA {
    public static void main(String[] args) {
        doStuff();
        System.out.println(10 / 0);
    }

    public static void doStuff() {
        System.out.println("Hii");
        doMoreStuff();
    }

    public static void doMoreStuff() {
        System.out.println("Hello");
        doLastmoreStuff();
    }

    public static void doLastmoreStuff() {
        System.out.println("Welcome");
    }

}
