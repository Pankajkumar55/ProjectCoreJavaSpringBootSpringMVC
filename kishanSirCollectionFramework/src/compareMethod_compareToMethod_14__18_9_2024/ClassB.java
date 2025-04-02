package compareMethod_compareToMethod_14__18_9_2024;

import java.util.Comparator;

public class ClassB implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // return o1.getEmpSal()-o2.getEmpSal(); // Sorting Basing on empSal
        // return o1.getEmpName().compareTo(o2.getEmpName()); // Sorting Basing on
        // empName
        return o1.getEmpDept().compareTo(o2.getEmpDept());// Sorting Basing on empDept
    }

}
