package oops_concept_task2;

public class ClassA {
    public static void main(String[] args) {
        Shape robj = new Rectangle();
        System.out.println("Area of Rectangle : " + robj.calculateArea());


        Shape cobj = new Circle();
        System.out.println("Area of Circle : " + cobj.calculateArea());

    }
}
