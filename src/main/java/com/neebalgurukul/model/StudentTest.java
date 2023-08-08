package com.neebalgurukul.model;

import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.dao.StudentDao;

public class StudentTest {
    public static void main(String[] args) {

	StudentDao stud = new StudentDao();
	Student obj = new Student();
	List<Student> studentList = new ArrayList<>();

	try {
	    // to read the table

	    studentList = stud.getStudentDetails();
	    for (Student s : studentList) {
		System.out.println(s);
	    }

	    // to add a student

	    Student toAdd = new Student("Malik", "malik@gmail.com", "Testin", 22);
	    stud.insertDetails(toAdd);

	    // to update the table

	    stud.updateCourse(2, "Java");

	    // to delete a student enrty

	    stud.deleteHard(1);

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
