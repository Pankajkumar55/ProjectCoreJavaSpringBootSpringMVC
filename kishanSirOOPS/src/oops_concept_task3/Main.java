package oops_concept_task3;

public class Main {
    public static void main(String[] args) {
        Employe hobj = new HourlyEmployee("KishanrSir", 20000, 2);
        hobj.displayDetails();
        System.out.println(hobj.calculateSalary());

        System.out.println("-------------------------");

        Employe sobj = new SalariedEmploye("Pankaj", 10000, 5);
        sobj.displayDetails();
        System.out.println(sobj.calculateSalary());

    }
}
