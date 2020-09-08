package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.Game;

public class BlackJackTest {
	static Game x;
	
	@BeforeClass
	public static void setup() {
	x = new Game();
	
	}
	
	@Test
	public void teestPlayerWins() {
		assertEquals("Expected: 1", 1, x.closest(20,22));
	}
	
	@Test
	public void teestDealerWins() {
		assertEquals("Expects 2", 2, x.closest(22, 20));
	}
	
	@Test
	public void teestBothLose() {
		assertEquals("Expctd: 0", 0, x.closest(22, 22));
	}
	
	@Test
	public void teestError() {
		assertEquals("Expected 3", 3, x.closest(-10, -25));
	}
	
	@Test
	public void teestDraw() {
		assertEquals("Expected 4", 4, x.closest(21, 21));
	}
}
