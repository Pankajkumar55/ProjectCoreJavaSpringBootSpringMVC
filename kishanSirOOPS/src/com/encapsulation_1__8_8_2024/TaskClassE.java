package com.encapsulation_1__8_8_2024;

import java.util.Scanner;

public class TaskClassE {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TaskClassE eobj = new TaskClassE();
        System.out.println(eobj.meth1());

    }

    String meth1() {

        System.out.println("Enter Employe Name : ");
        String empName = sc.nextLine();

        System.out.println("Enter Employe Id : ");
        int empId = sc.nextInt();

        System.out.println("Enter Employe Sallary : ");
        int empSallary = sc.nextInt();

        System.out.println("Enter Employe Experiance : ");
        int empExperiance = sc.nextInt();

        float sallary = 0;
        if (empExperiance < 10) {
            sallary = empSallary + (empSallary * 0.10f);

        } else {
            sallary = empSallary + (empSallary * 0.30f);

        }
        return "Employe Name : " + empName + "\nEmploye Id : " + empId + "\nEmploye Experiance : " +
                empExperiance + "\nActual Employe Sallary : " + empSallary + "\nAfter " + empExperiance + " years Experiance Sallary : " + sallary;

    }
}


