package com.hefshine.myass.collectionsorting.que7;

import java.util.Comparator;

public class EmployeeName implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2) {
		return (o1.getName()).compareTo(o2.getName());
	}

}
