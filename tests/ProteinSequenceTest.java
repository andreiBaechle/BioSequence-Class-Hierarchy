package edu.iastate.cs228.proj1.tests;

/*
 * @Author Andrei Baechle
 */

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.iastate.cs228.proj1.ProteinSequence;

public class ProteinSequenceTest {
	ProteinSequence s;
	String str = "ACT";
	private char[] b = str.toCharArray();

	@Before
	public void setUp() {
		this.s = new ProteinSequence(b);
	}

	@After
	public void tearDown() {
		this.s = null;
	}

	@Test
	public void isValidLetter() {

		assertEquals(true, s.isValidLetter('A'));
		assertEquals(false, s.isValidLetter('J'));
	}

}