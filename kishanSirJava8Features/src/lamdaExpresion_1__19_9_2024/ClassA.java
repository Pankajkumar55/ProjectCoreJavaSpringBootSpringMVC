package lamdaExpresion_1__19_9_2024;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().methodName();
    }

    void methodName() {

//		 LamdaExpresion is released only deal with @FunctionalInterface

//		InterfaceA a = (int a) -> System.out.println("hello world");  //1st way
//		InterfaceA a = (num) -> System.out.println("hello world");  //2nd way
        InterfaceA a = num -> System.out.println("hello world");  // 3rd way


        a.meth1(10);


        //InterfaceB b = (int num1, int num2) -> System.out.println("Additon" + (num1 + num2));  // 1st way
        InterfaceB b = (num1, num2) -> System.out.println("Additon" + (num1 + num2)); // 2nd way
//		InterfaceB b = num1,  num2 -> System.out.println("Additon" + (num1 + num2));  // C.E because 3rd way
//		is only applicable if we have only one parameter

        b.meth2(10, 20);


//		   InterfaceC c = ( int num1,  int num2 )-> {  // 1st way
        InterfaceC c = (num1, num2) -> {   // 2nd way


            if (num1 < 100) {
                System.out.println("if block executed");
                return num1 * 1;
            } else {
                System.out.println("else block executed");
                return num2 * 2;
            }

        };
        c.meth3(100, 200);

    }
}
