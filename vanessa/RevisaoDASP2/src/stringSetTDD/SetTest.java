package stringSetTDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import queueTDD.Queue;

public class SetTest {
	
	private Set set;
	
	@Before
	public void setUp() throws Exception {
		set = new Set();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando...");
	}

	@Test
	public void testNoText() {
		assertEquals(0, set.count());
	}
	
	@Test
	public void addOneStringInSet() {
		set.add("Meu nome é ");
		assertEquals(1, set.count());
	}
	
	@Test
	public void checkStringInSet() {
		String string = "Meu nome é ";
		set.add(string);
		assertTrue(set.contains(string));
	}
	
	@Test
	public void checkNoContainsStringInSet(){
		assertFalse(set.contains("My name is"));
	}
	
	@Test
	public void removeStringInSet(){
		String stringOne = "Meu nome é Vanessa.";
		String stringTwo = "Sou menina";
		String stringThree = "Sou mulher.";
		set.add(stringOne);
		set.add(stringTwo);
		set.add(stringThree);
		
		set.remove(stringTwo);
		assertEquals(2, set.count());
		assertFalse(set.contains(stringTwo));
	}
	
	@Test
	public void toStringSet(){
		String stringOne = "Meu nome é Vanessa.";
		String stringTwo = "Sou menina";
		set.add(stringOne);
		set.add(stringTwo);
		
		assertEquals("Meu nome é Vanessa.Sou menina", set.toString());
	}
	
	@Test
	public void unionTwoSets(){
		String stringOne = "Meu nome é Vanessa.";
		String stringTwo = "Sou menina\n";
		set.add(stringOne);
		set.add(stringTwo);
		
		Set otherSet = new Set();
		otherSet.add("Estudo Engenharia ");
		otherSet.add("de Software.");
		
		set.union(otherSet);
		assertEquals("Meu nome é Vanessa.Sou menina\nEstudo Engenharia de Software.", set.toString());
	}
	
	@Test
	public void intersection() {
		String stringOne = "Meu nome é ";
		String stringTwo = "Vanessa.";
		set.add(stringOne);
		set.add(stringTwo);
		
		Set otherSet = new Set();
		String stringFour = "Cleiton";
		otherSet.add(stringOne);
		otherSet.add(stringFour);
		
		assertTrue(set.intersection(otherSet));
	}
	
	@Test
	public void clearTheSet() {
		set.clear();
		assertEquals(0, set.count());
	}
	
	
	
	
}
