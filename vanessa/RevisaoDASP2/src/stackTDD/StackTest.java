package stackTDD;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StackTest {
	private Stack stack;

	@Before
	public void setUp() throws Exception {
		stack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando...");
	}

	@Test
	public void testNoElement() {
		assertEquals(0, stack.count());
	}
	
	@Test
	public void addOneElement(){
		stack.push(5);
		assertEquals(5, stack.top());
	}
	
	@Test
	public void addMutiplesEelements(){
		buildStack();
		assertEquals(4, stack.top());		
	}
	
	@Test
	public void countElementsOfStack(){
		buildStack();
		assertEquals(3, stack.count());
		
	}
	
	@Test
	public void buildStack(){
		stack.push(7);
		stack.push(3);
		stack.push(4);		
	}
	
	@Test
	public void removeElements(){
		buildStack();
		assertEquals(4, stack.pop());
		assertEquals(2, stack.count());
		assertEquals(3, stack.top());
	}
}
