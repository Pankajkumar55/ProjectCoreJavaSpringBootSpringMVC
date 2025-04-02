package interThradedComunication_9__30_8_2024;

public class ClassF {
    int amount = 1000;

    synchronized void with_draw(int amount) throws InterruptedException {
        if (this.amount < amount) {
            System.out.println("insufficient balance");

            // wait();
            Thread.sleep(3000);

            System.out.println("Amount creadited");
            this.amount = amount;
            System.out.println("with draw succesfull \nBalance is " + this.amount);

        } else {
            this.amount = amount;
            System.out.println("with draw succesfull \nBalance is " + this.amount);
        }
    }

    synchronized void deposite(int amount) {

        this.amount = this.amount + amount;
        System.out.println("Deposited successfully \nBalance is " + this.amount);
        notify();
        // notifyAll();
    }
}
