package interThradedComunication_9__30_8_2024;

public class ClassQ {

    public static void main(String[] args) {
        ClassF fobj = new ClassF();

        new Thread() // first Thread
        {
            public void run() {
                try {
                    fobj.with_draw(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() // second Thread
        {
            public void run() {

                fobj.deposite(900000);
            }
        }.start();

    }
}
