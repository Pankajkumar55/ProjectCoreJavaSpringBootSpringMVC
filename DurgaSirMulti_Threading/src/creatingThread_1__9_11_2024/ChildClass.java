package creatingThread_1__9_11_2024;

public class ChildClass {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " main Thread called");
        }


    }
}	
