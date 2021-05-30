package com.synechron.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void checkIfStringIsPalindrome(){
		String testStr = "nitin";
		Palindrome palindrome = new Palindrome();
		Assertions.assertTrue(palindrome.isPalindrome(testStr));
	}

}
