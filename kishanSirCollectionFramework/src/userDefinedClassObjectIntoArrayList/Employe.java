package userDefinedClassObjectIntoArrayList;

public class Employe {
    String empName;
    int empId;
    String empDept;

    public Employe(String empName, int empId, String empDept) {
        super();
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }

    public String toString() {
        return empName + " " + empId + " " + empDept;
    }
}
