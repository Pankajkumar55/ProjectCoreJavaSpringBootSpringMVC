package oops_concept_task3;

public class SalariedEmploye implements Employe {

    private String eName;
    private double eSalary;
    private int eTotalMonth;

    public SalariedEmploye(String eName, double eSalary, int eTotalMonth) {
        this.eName = eName;
        this.eSalary = eSalary;
        this.eTotalMonth = eTotalMonth;
    }

    public double calculateSalary() {
        System.out.print("Total salary " + eTotalMonth + " month : ");
        return eSalary * eTotalMonth;
    }

    public void displayDetails() {
        System.out.println("Employe Name : " + eName);
        System.out.println("Employe Salary : " + eSalary);

    }

}
