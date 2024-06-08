package com.saimun.springboottesting1.student;

import jakarta.validation.constraints.Email;

public record StudentResponseRecordDto(
		Integer id,
		Integer classId,
		String firstName,
		String lastName,
		@Email(message = "should be email")
		String email,
		int age,
		Integer studentProfileId,
		Integer schoolId
) {}
