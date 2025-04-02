package daemonThread_16__18_1_2025;

class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Child Thread");
        }
    }

}

public class DaemonThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        System.out.println(mt.isDaemon());
        mt.setDaemon(true);
		
		
		/*
		  
		 Always set a Non-Thread to Daemon-Thread before starting your Thread if you are not set before your thread
		 to Daemon Thread then you will get illigleArgumentTypeException 
		 
		*/
        System.out.println(mt.isDaemon());

        mt.start();

        System.out.println("End of Main Thread");
    }
}
