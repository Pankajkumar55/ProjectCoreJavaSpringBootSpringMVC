package lamdaExpresionTask_3__20_9_2024;

import java.util.Arrays;
import java.util.TreeSet;

public class ClassA {
    public static void main(String[] args) {
        new ClassA().show();
    }

    void show() {
        System.out.println("Implementing Lamda Expressions ");
        InterfaceA ia = (int arr[], TreeSet<String> set) ->
        {
            System.out.println("arr : " + Arrays.toString(arr));
            System.out.println("set : " + set);
            return new int[]{100, 200, 300, 400};
        };
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("kishna sir");
        ts.add("pankaj");
        ts.add("chandan");
        ts.add("gopal");

        int result[] = ia.meth1(new int[]{11, 22, 33}, ts);
        System.out.println("result : " + Arrays.toString(result));


    }
}