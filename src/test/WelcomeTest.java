package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest {

	@Test
	void EX_1() {
		assertEquals(Welcome.welcome("bob"),"Hello, and Bob");
		assertEquals(Welcome.welcome("sam"),"Hello, and Sam");
	}

	@Test
	void EX_2() {
		assertEquals(Welcome.welcome("   "),"Hello, my friend");
		assertEquals(Welcome.welcome(" "),"Hello, my friend");
	}
	
	@Test
	void EX_3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, AND JERRY !");
	}
	
	@Test
	void EX_4() {
		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, and Bob");
	}
	
	@Test
	void EX_5() {
		assertEquals(Welcome.welcome("amy,bob,steve"), "Hello, Amy, Bob, and Steve");
	}
	
	@Test
	void EX_6() {
		assertEquals(Welcome.welcome("Amy,BOB,jerry"), "Hello, Amy, and Jerry. AND HELLO, AND BOB !");
	}
	
	@Test
	void EX_7() {
		assertEquals(Welcome.welcome("Amy,BOB,jerry"), "Hello, Amy, and Jerry. AND HELLO, AND BOB !");
		assertEquals(Welcome.welcome("amy,bob,steve"), "Hello, Amy, Bob, and Steve");
	}

	
	
}











