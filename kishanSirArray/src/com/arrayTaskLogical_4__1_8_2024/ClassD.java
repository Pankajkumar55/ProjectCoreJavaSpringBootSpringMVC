package com.arrayTaskLogical_4__1_8_2024;

class ClassD {

    public static void main(String[] args) {
        ClassD d = new ClassD();
        d.meth1();
    }

    public boolean meth1() {
        int arr[] = new int[]{1, 2, 1, 1, 1};

        if (arr.length >= 1 && arr[0] == arr[arr.length - 1]) {
            System.out.println("true");

        }
        System.out.println("pankaj kuamr");
        return false;
    }
}