package com.layer;

import java.util.List;

public class Service {
    static Student studentt = new Student();
    Dao dao = new Dao();

    public List<Student> getStudentService() {
        System.out.println("Service class called");
        return dao.getStudent();
    }

    public String fileterStudentId(int sIdd) {
        List<Student> student = dao.getStudent();
        String msg = null;
        for (Student s : student) {
            if (s.getsId() == sIdd)
                msg = sIdd + " : Id is avilable in database";
            else
                msg = sIdd + " Id is not avilable in database";
        }
        return msg;
    }
}


