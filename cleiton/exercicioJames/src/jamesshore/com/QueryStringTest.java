package jamesshore.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueryStringTest {

	private QueryString qs;

	@Test
	public void testOneNameValuePair() {
		qs= new QueryString("name=value");
        assertEquals(1, qs.count());
        assertEquals("value", qs.valueFor("name"));
	}
	
	@Test
	public void testMultipleNameValuePairs() {
         qs = new QueryString("name1=value1&name2=value2&name3=value3");
         assertEquals(3, qs.count());
         assertEquals("value1", qs.valueFor("name1"));
         assertEquals("value2", qs.valueFor("name2"));
         assertEquals("value3", qs.valueFor("name3"));
     }

	
	@Test
	public void testNoNameValuePairs() {
		qs = new QueryString("");
		assertEquals(0, qs.count());
	}
	
	@Test
	public void testNull() {
        try {
            qs = new QueryString(null);
            fail("Se for jogada um exceção");
        }
        catch (NullPointerException e) {
            // expected
        }
	}
}
