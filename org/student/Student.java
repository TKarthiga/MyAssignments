package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is:");
	}
	public void studentDept() {
		System.out.println("Student department name is:");
	}
	public void studentId() {
		System.out.println("Student id is:");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
}
