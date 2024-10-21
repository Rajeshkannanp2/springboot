package com.rajesh.service;

import java.util.List;

import com.rajesh.entity.Student;


public interface StudentService {
	List<Student> getAllStudents();
	Student getStudentById(Long id);
	Student createStudent(Student student); 
	Student updateStudent(Long id, Student studentDetails);
	void deleteStudent(Long id);
}
