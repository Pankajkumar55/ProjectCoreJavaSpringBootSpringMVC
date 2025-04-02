package com.nt.model;

import lombok.Data;

//java bean
@Data
public class Employee {
	//java bean properties
	private   Integer empno;
	private  String ename;
	private   String  desg;
	private   Double   salary;
	private    Integer deptno;
	private   Double grossSalary;
	private   Double   netSalary;
		
	
	

}
