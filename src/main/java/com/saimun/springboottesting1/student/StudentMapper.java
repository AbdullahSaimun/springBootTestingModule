package com.saimun.springboottesting1.student;

import com.saimun.springboottesting1.school.School;
import org.springframework.beans.BeanUtils;
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

	public Student toStudent(StudentDTO studentDTO) {
		Student student = new Student();
		BeanUtils.copyProperties(studentDTO, student);
		School school = new School();
		school.setId(studentDTO.classId());
		student.setSchool(school);
		return student;
	}
}
