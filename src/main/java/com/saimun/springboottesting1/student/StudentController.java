package com.saimun.springboottesting1.student;

import com.saimun.springboottesting1.response.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping(value = "/students")
	private ResponseEntity<ResponseDTO> getAllStudentes() {
		ResponseEntity<ResponseDTO> allStudets = studentService.getAllStudets();
		return allStudets;
	}
}
