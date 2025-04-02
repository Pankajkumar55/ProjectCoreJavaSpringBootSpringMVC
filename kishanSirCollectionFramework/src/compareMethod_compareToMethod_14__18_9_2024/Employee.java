package compareMethod_compareToMethod_14__18_9_2024;

public class Employee {
    private String empName;
    private int empSal;
    private String empDept;

    public Employee(String empName, int empSal, String empDept) {
        this.empName = empName;
        this.empSal = empSal;
        this.empDept = empDept;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public String getEmpDept() {
        return empDept;
    }

    @Override
    public String toString() {
        return empName + " " + empSal + " " + empDept;
    }

}

/*
 * ===> It returns a NEGATIVE value if The current Object is < to the specified
 * Object ===> It returns a POSITIVE value if The current Object is > to the
 * specified Object ===>It returns '0' if The current Object is EQUAL to the
 * specified Object
 */