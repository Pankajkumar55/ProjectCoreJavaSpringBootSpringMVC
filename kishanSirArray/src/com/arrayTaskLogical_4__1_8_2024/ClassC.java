package com.arrayTaskLogical_4__1_8_2024;


public class ClassC {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        int arr[] = {1, 2, 3};

        int ssum = c.sum(arr);

        System.out.println(ssum);


    }

    public int sum(int[] nums) {

        return nums[0] + nums[1] + nums[2];


    }
}
