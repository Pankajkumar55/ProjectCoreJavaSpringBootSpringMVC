package com.constructor_1__2_7_2024;

public class AddAmount {
    int amount = 500;

    public AddAmount() {
        System.out.println("Amount : " + amount);

    }

    public AddAmount(int addAmount) {
        System.out.println("final Amount : " + (addAmount + amount));

    }

    public static void main(String[] args) {
        new AddAmount(15);
    }
}
