package pack1;

import java.util.Scanner;

public class ReverseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder(name);

        System.out.println(sb.reverse());

    }
}
