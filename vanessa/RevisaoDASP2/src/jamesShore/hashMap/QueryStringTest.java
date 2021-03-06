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
	
	
	@Test
	public void testMultipleNameValuePairs(){
		qs = new QueryString("name1=value1&name2=value2&name3=value3");
		assertEquals("value1", qs.valueFor("name1"));
		assertEquals("value2", qs.valueFor("name2"));
		assertEquals("value3", qs.valueFor("name3"));
	}
	
	@Test (expected = RuntimeException.class)
	public void testNameNotFound(){
		qs = new QueryString("name=value");
		qs.valueFor("name1");
	}
	
	@Test
	public void testCountForMultiplePairs(){
		qs = new QueryString("name1=value1&name2=value2&name3=value3");
		assertEquals(3, qs.count());
	}
}
