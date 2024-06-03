package com.saimun.springboottesting1.studentprofile;

import com.saimun.springboottesting1.student.Student;
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
public class StudentProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String bio;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;

	public StudentProfile(String bio) {
		this.bio = bio;
	}
}
