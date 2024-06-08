package com.saimun.springboottesting1.student;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.saimun.springboottesting1.school.School;
import com.saimun.springboottesting1.studentprofile.StudentProfile;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer classId;

	private String firstName;

	private String lastName;

	private String email;

	private int age;

	@OneToOne(mappedBy = "student")
	@JsonManagedReference
	private StudentProfile studentProfile;

	@ManyToOne
	@JoinColumn(name = "school_id")
	@JsonManagedReference
	private School school;

	public Student(Integer classId, String firstName, String lastName, String email, int age) {
		this.classId = classId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
}
