import java.util.Scanner;

public class ClassF {

    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    public static void main(String[] args) throws Exception {
        ClassF f = new ClassF();
        try {
            f.meth1();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("main method called");
    }

    void meth1() throws Exception {
        if (age <= 10) {
            System.out.println(age);
            throw new Exception("less greater than 10");
        } else {

            System.out.println("age is greater then 10 : " + age);

        }
    }
}
