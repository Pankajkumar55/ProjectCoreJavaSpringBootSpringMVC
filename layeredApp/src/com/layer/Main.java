package com.layer;

import java.util.List;

public class Main {
    // Client

    static Controller controller = new Controller();

    public static void main(String[] args) {

        List<Student> students = controller.listController();
        students.forEach(System.out::println);
        System.out.println(controller.checkId(10));
    }
}