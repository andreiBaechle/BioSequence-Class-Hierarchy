package edu.iastate.cs228.proj1.tests;

/*
 * @Author Andrei Baechle
 */

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.iastate.cs228.proj1.GenomicDNASequence;

public class GenomicDNASequenceTest {
	GenomicDNASequence s;
	String str = "ACT";
	private char[] b = str.toCharArray();
	
	@Before
	public void setUp() {
		this.s = new GenomicDNASequence(b);
	}

	@After
    public void tearDown() {
        this.s = null;
	}
	
	@Test
	public void markCoding() {
//		assertEquals(true, markCoding());
		
	}
	
	@Test
	public void extractExons() {
		int[] arr1 = {1, 5, 8, 10, 13, 16};
		char[] arr2 = {'A', 'T', 'G', 'C', 'C', 'T', 'C', 'A', 'A', 'T', 'A', 'G'};
		assertEquals(arr2, s.extractExons(arr1));
		}
	}
	
