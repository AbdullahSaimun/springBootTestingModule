package com.saimun.springboottesting1.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

	StudentMapper studentMapper;

	@BeforeEach
	void setUp() {
		studentMapper = new StudentMapper();
	}

	@Test
	void shoudStudentDtoToStudent() {
		StudentDTO studentDTO = new StudentDTO("Abdulla","saimun",3,"abdullah@gmail.com",23,1);
		Student student = studentMapper.toStudent(studentDTO);
		assertEquals(student.getFirstName(),studentDTO.firstName());
		assertEquals(student.getLastName(),studentDTO.lastName());
		assertEquals(student.getClassId(),studentDTO.classId());
		assertEquals(student.getEmail(),studentDTO.email());
		assertNotNull(student.getSchool());

	}
}