package com.saimun.springboottesting1.studentprofile;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Integer> {
}