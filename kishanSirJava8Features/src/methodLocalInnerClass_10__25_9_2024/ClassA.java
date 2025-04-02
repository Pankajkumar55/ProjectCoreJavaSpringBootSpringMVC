package methodLocalInnerClass_10__25_9_2024;

public class ClassA {

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth();
    }

    void meth() {
        String ss = "java";

        class InnerClass {
            void msg() {
                System.out.println(ss.concat("is awesome"));
            }
        }
        new InnerClass().msg();

        class InnerClassB {
            void display() {
                System.out.println(ss.concat("is amazing"));
            }
        }
        new InnerClassB().display();

    }
}