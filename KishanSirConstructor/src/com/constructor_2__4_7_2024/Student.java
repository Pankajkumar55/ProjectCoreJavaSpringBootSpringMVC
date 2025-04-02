package com.constructor_2__4_7_2024;

public class Student {
    static String course = "B.tech";
    String sName;
    int sId;
    int sRoll;

    public Student(String name, int id, int roll) {
        sName = name;
        sId = id;
        sRoll = roll;
    }

    public static void main(String[] args) {
        Student s = new Student("Pankaj", 100, 1);
        Student s1 = new Student("Chandan", 101, 2);
        Student s2 = new Student("Suman", 102, 3);

        System.out.println("StudentName : " + s.sName + " StudentId : " + s.sId + " StudentRoll : " + s.sRoll + " StudentCourse : " + Student.course);
        System.out.println("StudentName : " + s1.sName + " StudentId : " + s1.sId + " StudentRoll : " + s1.sRoll + "StudentCourse : " + Student.course);
        System.out.println("StudentName : " + s2.sName + " StudentId : " + s2.sId + " StudentRoll : " + s2.sRoll + " StudentCourse : " + Student.course + "\n");

        s.sName = "pankaj kumar";

        Student.course = "M.tech";
        System.out.println("StudentName : " + s.sName + ", StudentId : " + s.sId + " StudentRoll : " + s.sRoll + ", " + Student.course);
        System.out.println("StudentName : " + s1.sName + ", StudentId : " + s1.sId + " StudentRoll : " + s1.sRoll + ", " + s.course);
        System.out.println("StudentName : " + s2.sName + ", StudentId : " + s2.sId + " StudentRoll : " + s2.sRoll + ", " + course);

    }
}
