package com.layer;

import java.util.List;

public class Controller {
    Service service = new Service();

    public List<Student> listController() {
        System.out.println("Controller class called");
        return service.getStudentService();
    }


    public String checkId(int id) {
        return service.fileterStudentId(id);
    }
}



