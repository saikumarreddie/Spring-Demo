package com.demo.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private Address studentAddress;

	/*
	 * public void setStudentAddress(Address studentAddress) { this.studentAddress =
	 * studentAddress; }
	 */
	public Student() {

	}

	@Autowired
	public Student(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void displayStudentDetails() {

		studentAddress.displayAddress();

	}

}
