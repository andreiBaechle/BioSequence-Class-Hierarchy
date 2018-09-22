package edu.iastate.cs228.proj1.tests;

/*
 * @Author Andrei Baechle
 */

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.iastate.cs228.proj1.DNASequence;

public class DNASequenceTest {
	DNASequence s;
	String str = "ACT";
	private char[] b = str.toCharArray();
	
	@Before
	public void setUp() {
		this.s = new DNASequence(b);
	}

	@After
    public void tearDown() {
        this.s = null;
	}
	
	@Test
	public void isValidLetter() {
		char b = 'C';
		char f = 's';
		assertEquals(true, s.isValidLetter(b));
		assertEquals(false, s.isValidLetter(f));
	}

}
