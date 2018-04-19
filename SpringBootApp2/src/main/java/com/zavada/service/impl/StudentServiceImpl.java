package com.zavada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavada.entity.Student;
import com.zavada.repository.StudentRepository;
import com.zavada.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired private StudentRepository studentRepository;
	
	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public Student findById(int id) {
		return studentRepository.getOne(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

}
