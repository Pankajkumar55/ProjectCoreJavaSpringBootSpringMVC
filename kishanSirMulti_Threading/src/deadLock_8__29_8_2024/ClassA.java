package deadLock_8__29_8_2024;

public class ClassA {

    public static void main(String[] args) {

        final String A = "Java";
        final String B = "Python";
        Thread t1 = new Thread() { // Anonmyous Inner Class starts here
            @Override
            public void run() {

                synchronized (A) // Thread 1 is holding java
                {
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (B) // Thread will waiting for B (Python)
                    {
                        System.out.println("Thread 1 locked on B");

                    }
                    System.out.println("no dead lock ");
                }

            }
        }; // Anonomys Inner Class Ends here

        Thread t2 = new Thread() {
            @Override
            public void run() {

                synchronized (B) // Thread 2 is holding Python
                {
                    System.out.println("Thread 2 is locked on B");
                    try {
                        Thread.sleep(100);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (A) // Thread will be waiting for A (Java)
                    {
                        System.out.println("Thread 2 locked on A");
                    }

                }
                System.out.println("no dead lock");
            }
        };
        t1.start();
        t2.start();
    }

}
