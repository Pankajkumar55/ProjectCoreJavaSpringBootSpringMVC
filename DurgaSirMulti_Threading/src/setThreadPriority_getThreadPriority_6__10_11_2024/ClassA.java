package setThreadPriority_getThreadPriority_6__10_11_2024;

public class ClassA {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " main Thread executed");
        }
        MyThreadClass class1 = new MyThreadClass(); // default Thread priority 5
        class1.setName("first Objcet");
        Thread.currentThread().setPriority(2); // default priority given by JVM which is 5

		/*
		
		 all thread priority inherit by main thread if we set main Thread priority
		 before
		 created thread class object then all thread priority implicitly inherit main
		 thread priority
		
		*/
        class1.start();
        MyThreadClass class2 = new MyThreadClass();
        class2.setName("second object");
        MyThreadClass class3 = new MyThreadClass();
        class3.setName("third objcet");
        class2.start();
        class3.start();

        System.out.println(class1.getPriority());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(class2.getPriority());
        System.out.println(class3.getPriority());
//		class1.setPriority(20); // IllegalArgumentException because Thread priority
//		1(higher) to 10(lower)

//		some operating system does'nt provide proper support for Thread priority

    }
}
