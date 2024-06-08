package com.saimun.springboottesting1.student;

import com.saimun.springboottesting1.response.ResponseDTO;
import com.saimun.springboottesting1.response.ResponseMessage;
import com.saimun.springboottesting1.response.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	private final StudentMapper studentMapper;

	public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
		this.studentRepository = studentRepository;
		this.studentMapper = studentMapper;
	}

	public ResponseEntity<ResponseDTO> getAllStudets() {
		var allStudents = studentRepository.findAll().stream()
				.map(obj ->{
					StudentResponseRecordDto dto = studentMapper.fromStudentToStudentResponseDTO(obj);
					return dto;
				}).collect(Collectors.toList());
		return new ResponseEntity<>(
				new ResponseDTO(
						ResponseStatus.OK,
						ResponseMessage.DATA_AVAILABLE,
						allStudents
				), HttpStatus.OK
		);

	}
}
