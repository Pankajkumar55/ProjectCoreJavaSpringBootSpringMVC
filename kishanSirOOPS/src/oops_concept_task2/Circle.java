package oops_concept_task2;

public class Circle extends Shape {
    public double calculateArea() {
        double pi = 3.142, area;
        double radius = 5;
        area = pi * radius * radius;
        return area;
    }
}
