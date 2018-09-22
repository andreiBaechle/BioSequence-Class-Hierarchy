package edu.iastate.cs228.proj1.tests;

/*
 * @Author Andrei Baechle
 */

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.iastate.cs228.proj1.CodingDNASequence;

public class CodingDNASequenceTest {
	CodingDNASequence s;
	String str = "ATGACC";
	private char[] b = str.toCharArray();
	
	@Before
	public void setUp() {
		this.s = new CodingDNASequence(b);
	}

	@After
    public void tearDown() {
        this.s = null;
	}
	
	@Test
	public void checkStartCodon() {
		
		assertEquals(true, s.checkStartCodon());
	}
	
	@Test
	public void translate() {
		char[] arr1 = s.translate();
		char[] arr2 = {'M', 'T'};
		assertEquals(arr2[0],arr1[0]);
		assertEquals(arr2[1],arr1[1]);
	}
	
	
}