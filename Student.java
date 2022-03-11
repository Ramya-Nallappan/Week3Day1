package org.student;

import org.department.Department;

public class Student extends Department{

	void studentName() 
	{
		System.out.println("The Student Name" ); 
	}
	
	void studentDept() 
	{
		System.out.println("Student Department" ); 
	}
	void studentId()
	{
		System.out.println("Student ID" ); 
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
	}

}
