package com.zavada.service;

import java.util.List;

import com.zavada.entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	Student findById(int id);
	
	List<Student> findAllStudents();
}
