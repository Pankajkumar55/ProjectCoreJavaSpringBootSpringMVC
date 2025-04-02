package synchronized_14__15_11_2024;

class Display {

    public synchronized void wish(String name) {
        for (int a = 0; a < 10; a++) {
            System.out.print("Good Morning ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}