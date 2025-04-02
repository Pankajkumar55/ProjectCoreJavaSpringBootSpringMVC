package kishanSirFinalKeyword_1__2_9_2024;

public class ClassA { // final class we can't be inherit
    final int a = 0; // final variable are constants

    public static void main(String[] args) {
        new ClassA().meth1();
    }

    public final void meth1() { // final method we can inherit but we can't override
        System.out.println(a);
    }
}
