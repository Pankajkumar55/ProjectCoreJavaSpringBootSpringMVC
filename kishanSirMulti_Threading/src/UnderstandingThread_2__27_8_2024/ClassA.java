package UnderstandingThread_2__27_8_2024;

public class ClassA extends Thread {
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        Thread t1 = new Thread(aobj);

        t1.start();

		/*
		  Whenever we are calling t1.start() a new thread will be created & that new
		  thread is responsible for running the run() present in ClassA (Because of
		  Overriding )
		*/

        // t1.run()

		/*
		  Whenever we are calling t1.run() no new thread will be created, we are
		  calling run() present in thread class just like a normal method call but
		  run() present in classA will be excuted (Because of overriding)

		*/

        // Thread t2 = new Thread();
        // t2.start();

		/*
		  Whenever we are calling t2.start() a new Thread will be created & that new
		  Thread is responsible for running the run() present in Thread Class

		*/

        // t2.run();

		/*

		  Whenever we are calling t2.run() No new Thread will be created, we are
		  calling run() present in Thread Class just like a normal method call.

		*/

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run() executed : " + i);
        }
    }

}