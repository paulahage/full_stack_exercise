package com.paula.back;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackApplicationTests {

	@Test
	void testOne() {
		assertEquals(1, 2);
	}

	@Test
	void testTwo() {
		assertEquals(1, 1);
	}
}
