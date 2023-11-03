package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
		result = main.add(1, -1);
		assertEquals(0, result);
		result = main.add(1, -101);
		assertEquals(-100, result);
	}

}
