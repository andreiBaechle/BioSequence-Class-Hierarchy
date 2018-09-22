package edu.iastate.cs228.proj1.tests;

/*
 * @Author Andrei Baechle
 */

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.iastate.cs228.proj1.Sequence;


public class SequenceTest {
	Sequence s;
	String str = "ACT";
	private char[] b = str.toCharArray();
	
	@Before
    public void setUp() {
		this.s = new Sequence(b);
	}
	
	 @After
	    public void tearDown() {
	        this.s = null;
	 }
	 
	 @Test
	 public void Sequence() {
		 new Sequence(b);
	 }
	 
	 @Test
	 public void seqLength() {
		assertEquals(3, s.seqLength());
	 }
	 
	 @Test
	 public void getSeq() {
		 assertEquals(s , s.getSeq());
	 }
	 
	@Test
	public void toStringTest() {
		String u = "[A, C, T]";
		assertEquals(u, s.toString());
	}
	
	@Test
	public void equals() {
		assertEquals(b, s.equals(b));
	}
	
	@Test
	public void isValidLetter() {
		char a = 'A';
		assertEquals(true, s.isValidLetter(a));
	}
	

	 
	 
	 
		

}
