package tests;

import static org.junit.Assert.assertNotNull;

import java.util.Scanner;

import org.junit.Test;

public class Tests {

	@Test
	public void testScanne3123r() {
		Scanner scanner = new Scanner(System.in);
		assertNotNull(scanner);
	}

}
