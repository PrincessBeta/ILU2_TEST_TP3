package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest {

	@Test
	void EX_1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}

}
