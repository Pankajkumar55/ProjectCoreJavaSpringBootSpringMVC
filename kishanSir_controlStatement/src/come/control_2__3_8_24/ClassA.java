package come.control_2__3_8_24;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth1();
    }

    public void meth1() {
        while (true) {
            System.out.println("<><><><>WELCOME TO DAILY FRESH MART<><><><>\n");
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1 . Menu\n2 . Exit");
                int menu = sc.nextInt();

                if (menu == 1) {
                    System.out.println("*** Main Menu ***\n");
                    System.out.println(
                            "1.Groceries \n2.Fruits & Veggies \n3.Beverages\n4.Chocolates\n5.Snaks\n0.Start Menu\n"
                                    + "100.Get bill");

                    System.out.println("Please Select Code for Further Deatils : ");
                    int mainMenu = sc.nextInt();
                    switch (mainMenu) {

                        case 1:
                            System.out.println("***Groceries****\n");
                            System.out.println("1.Spices");
                            System.out.println("2.Diary");
                            System.out.println("3.Meat");
                            System.out.println("Grains");
                            System.out.println("0.Previous Menu");
                            System.out.println("100.Get Menu");

                            System.out.println("Please Select Code for Further Deatils : ");
                            int groceries = sc.nextInt();

                            switch (groceries) {
                                case 1:
                            }

                            int grocer = sc.nextInt();
                            switch (grocer) {
                                case 1:
                                    System.out.println("***Spices***");
                                case 2:
                                    System.out.println("***Diary***");
                                case 3:
                                    System.out.println("***Meat***");
                                    int meat = sc.nextInt();

                                    switch (meat) {
                                        case 1:
                                            System.out.println("Please select code for Further Detatils :");
                                    }
                                case 4:
                                    System.out.println("***Grains***");
                                case 5:
                                    System.out.println();
                                default:
                                    System.out.println(" Your are Entered Invalid number");

                            }
                        case 2:
                            System.out.println("***Fruitts & Veggies***");
                        case 3:
                            System.out.println("***Beverages***");
                        case 4:
                            System.out.println("***Chocolates***");
                        case 5:
                            System.out.println("***Snaks***");

                    }
                } else {
                    return;
                }
            }
        }

    }

}
