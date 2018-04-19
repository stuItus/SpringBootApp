package com.zavada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zavada.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
