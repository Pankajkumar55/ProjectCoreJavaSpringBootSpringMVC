package stringClassAllMethod_2__3_8_2024;

import java.util.Arrays;
import java.util.Scanner;

public class StringClassAllmethod {

    public static void main(String[] args) {
        StringClassAllmethod s = new StringClassAllmethod();
        //s.meth1();
        s.meth2();
    }

    void meth1() {
        System.out.println("meth1() called\n");
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = new String("Java");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("Java".equals(s1));
        System.out.println(s2.equals(s4));
        System.out.println(new String("java").equals(s2));
        System.out.println("java".equals("Java"));
        System.out.println("java".equalsIgnoreCase("Java"));
        System.out.println("Java".equals(new String("java")));

        System.out.println("---------------------------------------");
        System.out.println(s1 == s2);
        System.out.println(s2 == s4);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1 == "Java");
        System.out.println("Java" == "Java");
        System.out.println(s2 == new String("Java"));


    }

    void meth2() {
        System.out.println("Implementing String Class method\s");

        String s1 = "Java";
        System.out.println("s1 : " + s1);
        System.out.println("length() : " + s1.length());
        System.out.println("concat() : " + s1.concat(" is awesome"));
        System.out.println("length() :" + s1.concat(" is awesome").length());
        System.out.println();

        System.out.println("\ncharAt() : " + s1.charAt(0));
        System.out.println("charAt() :" + s1.charAt(s1.length() / 2));

		/*Scanner sc=new Scanner(System.in);
		System.out.println("\nPlease enter your Gender Male or Female");
		char gender=sc.next().charAt(0);
		switch(gender) {
		case 'f','F':
			System.out.println("User is Female");
			break;
		case 'm','M':
			System.out.println("User is Male");
		default :
			System.out.println("Invalid Data");
		}
		sc.close();
		 */
        System.out.println("\nStartsWith() : " + s1.startsWith("J"));
        boolean b = s1.startsWith("ja");
        System.out.println(b + "\n");

        String s2 = "java is awesome";

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase() + "\n");

        System.out.println(s2.substring(8));
        System.out.println(s2.substring(8, 11));
        System.out.println(s2.substring(0, 3) + "\n");

        System.out.println("replace() : " + s2.replace('a', 'A'));
        System.out.println("s2 : " + s2 + "\n");

        String s3 = "Hello world ";
        System.out.println("length() : " + s3.length());  // Length always start from 1
        System.out.println("trim() : " + s3.trim().length() + "\n");

        System.out.println("indexOf() : " + s3.indexOf('o'));
        System.out.println("lastIndexOf() : " + s3.lastIndexOf('o'));

        String s4 = "ABCDEF";
        byte arr[] = s4.getBytes();    // We will used getByte() in IO-Streams

        for (byte bt : arr) {  //get
            System.out.print((char) bt + " ");
        }

        System.out.println("\n");
        String dob = "13-July-1987";
        String ss[] = dob.split("-");
        for (String sss : ss)
            System.out.println(sss);

        String msg = "I love you maa";
        String[] arr2 = msg.split("");
        String[] arr3 = msg.split(" ");

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3) + "\n");

        System.out.println("compareTo() : " + "A".compareTo("B"));
        System.out.println("compareTo() : " + "A".compareTo("D"));
        System.out.println("compareTo() : " + "D".compareTo("A"));
        System.out.println("compareTo() : " + "D".compareTo("D"));

    }
}
