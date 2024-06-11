package com.saimun.springboottesting1.student;

import com.saimun.springboottesting1.school.School;
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

	@Test
	public void shouldMapStudentToStudentDTO() {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("firstName");
		student.setLastName("lastName");
		student.setClassId(1);
		student.setEmail("abdulla@gmail.com");
		student.setAge(33);
		School school = new School();
		school.setId(1);
		student.setSchool(school);

		StudentDTO dto = studentMapper.toStudentDTO(student);
		assertEquals(dto.firstName(),student.getFirstName());
		assertEquals(dto.lastName(),student.getLastName());
	}
}