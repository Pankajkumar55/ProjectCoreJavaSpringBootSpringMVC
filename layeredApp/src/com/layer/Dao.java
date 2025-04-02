package com.layer;

import java.util.Arrays;
import java.util.List;

public class Dao {

    List<Student> list = Arrays.asList(new Student("pankaj", "developer", "buxar", 5)
            , new Student("chandan", "webDeveloper", "patna", 2)
            , new Student("ranjan", "analyst", "motihari", 3)

    );

    public List<Student> getStudent() {
        System.out.println("Dao class called");
        return list;
    }



}
