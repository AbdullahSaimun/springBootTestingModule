package com.saimun.springboottesting1;

import com.saimun.springboottesting1.school.School;
import com.saimun.springboottesting1.school.SchoolRepository;
import com.saimun.springboottesting1.student.Student;
import com.saimun.springboottesting1.student.StudentRepository;
import com.saimun.springboottesting1.studentprofile.StudentProfile;
import com.saimun.springboottesting1.studentprofile.StudentProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CommanLineRunnerClass implements CommandLineRunner {

	private final SchoolRepository schoolRepository;
	private final StudentProfileRepository studentProfileRepository;

	private final StudentRepository studentRepository;

	public CommanLineRunnerClass(SchoolRepository schoolRepository, StudentProfileRepository studentProfileRepository, StudentRepository studentRepository) {
		this.schoolRepository = schoolRepository;
		this.studentProfileRepository = studentProfileRepository;
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// Create the school entity
		School school = new School("SC High School");
		var schoolSavedEntity = schoolRepository.save(school); // Save the school first

		// Create the student entities
		Student studentOne = new Student(15, "firstName", "lastName", "email@email.com", 22);
		Student studentTwo = new Student(11, "secondFirstName", "secondLastName", "secondEmail@email.com", 22);

		// Associate the students with the school
		studentOne.setSchool(schoolSavedEntity);
		studentTwo.setSchool(schoolSavedEntity);
		var saveStudentOneEntity = studentRepository.save(studentOne);
		var saveStudentTwoEntity = studentRepository.save(studentTwo);

		// Create the student profile entities
		StudentProfile studentOneProfile = new StudentProfile("this is first student bio");
		StudentProfile studentTwoProfile = new StudentProfile("this is second student bio");

		// Associate the profiles with the students
		studentOneProfile.setStudent(saveStudentOneEntity);
		studentTwoProfile.setStudent(saveStudentTwoEntity);
		studentProfileRepository.saveAll(Arrays.asList(studentOneProfile,studentTwoProfile));

	}
}
