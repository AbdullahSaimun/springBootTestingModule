package com.saimun.springboottesting1.student;

public record StudentDTO(
		String firstName,
		String lastName,
		Integer classId,
		String email,
		int age,
		Integer schoolId
) {
}
