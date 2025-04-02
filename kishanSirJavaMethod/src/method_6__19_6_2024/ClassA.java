package method_6__19_6_2024;

// Method

public class ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println("java" + a.testMethod1());

    }

    public String testMethod1() {
        System.out.println(35);
        return new ClassA().testMethod3(new ClassA().testMethod2()) + new ClassA().testMethod4("here");

    }

    public int testMethod2() {
        System.out.println(25);
        return 25 + 5;
    }

    public String testMethod3(int a) {
        System.out.println(15);
        return "is";

    }

    ;

    public String testMethod4(String s) {
        System.out.println(45);
        return "awesome";
    }
}
