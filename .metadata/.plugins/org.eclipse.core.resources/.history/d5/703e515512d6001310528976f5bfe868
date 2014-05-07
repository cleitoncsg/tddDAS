package jamesshore.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueryStringTest {
	
	 QueryString qs;

	@Before
	public void setUp() throws Exception {
		 qs = new QueryString ("name = value"); 
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando...");
	}
	
	@Test
	public void testOneNameValuePair () {  
	      assertEquals (1, qs.count ()); 
	}

}
