package setThreadName_getThreadName_5__9_11_2024;

public class ClassA {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()); // Getting current Thread name

        MyThread mt = new MyThread();
        System.out.println(mt.getName()); // Getting Thread name
        MyThread mt1 = new MyThread();  // Getting Thread name
        System.out.println(mt1.getName() + "\n"); // Getting Thread name

        System.out.println("setName method in Thread\n");
        mt.setName("FirstThread"); // Setting Thread name
        mt1.setName("SecondThread"); // Setting Thread name
        Thread.currentThread().setName("MainThread"); // Setting Thread name

        System.out.println("Getting name a Thread After Setting explicitly " + mt.getName());
        System.out.println("Getting name a Thread After Setting explicitly " + mt1.getName());
        System.out.println("Getting name a Thread After Setting explicitly " + Thread.currentThread().getName());

        System.out.println(mt.getPriority());  //
        System.out.println(mt1.getPriority()); //
        System.out.println(Thread.currentThread().getPriority()); //

    }
}
