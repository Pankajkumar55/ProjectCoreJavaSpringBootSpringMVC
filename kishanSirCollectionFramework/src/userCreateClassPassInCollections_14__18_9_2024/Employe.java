package userCreateClassPassInCollections_14__18_9_2024;

public class Employe implements Comparable<Employe> {
    private String empName;
    private int empId;
    private String empDept;

    public Employe(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;

    }

    @Override
    public String toString() {
        return empName + " " + empId + " " + empDept;
    }

    @Override
    public int compareTo(Employe o) {

        return this.empId - o.empId;
    }

}
