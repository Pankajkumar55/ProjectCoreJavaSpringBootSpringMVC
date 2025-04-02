package oops_concept_task3;

public class HourlyEmployee implements Employe {

    private String eName;
    private double eSalary;
    private int eHourly;

    public HourlyEmployee(String eName, double eSalary, int eHourly) {

        this.eName = eName;
        this.eSalary = eSalary;
        this.eHourly = eHourly;

    }

    public double calculateSalary() {
        System.out.print("Total salary " + eHourly + " Hours : ");
        return eSalary * eHourly;
    }

    public void displayDetails() {
        System.out.println("Employe Name : " + eName);
        System.out.println("Employe Salary : " + eSalary);
        System.out.println("Employe Total job " + eHourly + " Hours");
    }
}
