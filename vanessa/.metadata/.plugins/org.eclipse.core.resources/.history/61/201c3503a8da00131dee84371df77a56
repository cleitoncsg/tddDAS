package jamesShore.hashMap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueryStringTest {
	
	QueryString qs;

	/*@Before
	public void setUp() throws Exception {
		qs = new QueryString("name=value");
	}*/

	@Test
	public void testOneNameValuePair() {
		qs = new QueryString("name=value");
		assertEquals(1, qs.count());
	}
	
	@Test
	public void testNoNameValuePairs(){
		qs = new QueryString("");
		assertEquals(0, qs.count());
	}
	
	@Test (expected = NullPointerException.class)
	public void testNull(){
		qs = new QueryString (null);
	}
	
	@Test
	public void testValueFor(){
		qs = new QueryString("name=value");
		assertEquals("value", qs.valueFor("name"));
	}
}
