package com.saimun.springboottesting1.student;

import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
	public StudentResponseRecordDto fromStudentToStudentResponseDTO(Student student) {
		return new StudentResponseRecordDto(student.getId(),
				student.getClassId(),
				student.getFirstName(),
				student.getLastName(),
				student.getEmail(),
				student.getAge(),
				student.getStudentProfile().getId(),
				student.getSchool().getId());
	}
}
