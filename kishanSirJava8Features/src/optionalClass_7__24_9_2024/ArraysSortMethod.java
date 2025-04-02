package optionalClass_7__24_9_2024;

import java.util.Arrays;

public class ArraysSortMethod {
    public static void main(String[] args) {
        new ArraysSortMethod().meth1();
    }

    void meth1() {
        System.out.println("meth1() called");
        int arr[] = {1, 5, 8, 9, 7, 10, 11, 30, 50};
        System.out.println("Before sorting : " + Arrays.toString(arr));

        // Arrays.sort(arr); // it is sort all data
        Arrays.parallelSort(arr, 1, 5); // it is sort only index position data which is given by user
        Arrays.parallelSort(arr, 6, 7);

        System.out.println("After sorting : " + Arrays.toString(arr));

    }

}
