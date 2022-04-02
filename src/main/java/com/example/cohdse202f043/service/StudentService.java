package com.example.cohdse202f043.service;


import java.util.List;

import com.example.cohdse202f043.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
