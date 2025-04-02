package synchronized_15__18_1_2025;

class MyThread {

    synchronized static void wish(String facultyName) {

        for (int i = 0; i < 10; i++)
            System.out.println(facultyName + " will be take our class");
    }

}

public class Main extends Thread {
    MyThread myThread;
    String facultyName;

    public Main(MyThread myThread, String facultyName) {
        super();
        this.myThread = myThread;
        this.facultyName = facultyName;
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        MyThread m2 = new MyThread();

		/*

		if we have two or more thread and both thread have different object then result will not consistence that
		will provid our class to class level lock(means at a time a thread will enter our class then use static
		and also synchronized) then we will find consistennce result

		*/

        Main main = new Main(m, "KishanSir");
        Main main2 = new Main(m2, "DurgaSir");
        main.start();
        main2.start();

    }

    public void run() {
        myThread.wish(facultyName);
    }
}
