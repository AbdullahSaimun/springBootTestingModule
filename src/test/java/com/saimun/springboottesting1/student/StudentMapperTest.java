package com.saimun.springboottesting1.student;

import org.junit.jupiter.api.*;

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

	@BeforeAll
	static void beforeAll() {
		System.out.println("before all method");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("after all method");
	}

	@Test
	public void testMehodOne() {
		System.out.println("test method");
	}

}