package com.saimun.springboottesting1.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

	@BeforeEach
	void setUp() {
		System.out.println("before running");
	}

	@AfterEach
	void tearDown() {
		System.out.println("after test method");
	}

	@Test
	public void testMehodOne() {
		System.out.println("test method");
	}

}