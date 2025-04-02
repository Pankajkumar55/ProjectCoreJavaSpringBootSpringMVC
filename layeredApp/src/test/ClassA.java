package test;

public class ClassA {

    public void meth1() throws ClassNotFoundException {
        throw new ClassNotFoundException("check file location");
    }

    public static void main(String[] args) {
        try {
            new ClassA().meth1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
