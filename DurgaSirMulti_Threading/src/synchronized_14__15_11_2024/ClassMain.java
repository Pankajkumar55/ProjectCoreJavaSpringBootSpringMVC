package synchronized_14__15_11_2024;

public class ClassMain extends Thread {
    Display d;
    String name;

    public ClassMain(Display d, String name) {
        super();
        this.d = d;
        this.name = name;
    }

    public static void main(String[] args) {
        Display dp = new Display();
        ClassMain cm = new ClassMain(dp, " pankaj");
        ClassMain cm1 = new ClassMain(dp, " rohit");
        cm.start();
        cm1.start();

    }

    public void run() {
        d.wish(name);
    }
}
