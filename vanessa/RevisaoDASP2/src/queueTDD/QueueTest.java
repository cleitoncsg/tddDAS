package queueTDD;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//adiciona
//remove
//primeiro
//tamanho

public class QueueTest {
	private Queue queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new Queue();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando...");
	}

	@Test
	public void testNoelement() {
		assertEquals(0, queue.count());
	}
	
	@Test
	public void testAddOneElement() {
		queue.pushBack(10);
		assertEquals(10, queue.front());
		assertEquals(10, queue.back());
	}
	
	@Test
	public void addMultiplesElements() {
		buildQueue();
		assertEquals(4, queue.count());
		assertEquals(10, queue.front());
		assertEquals(4, queue.back());
	}
	
	@Test
	public void removeElements() {
		buildQueue();
		assertEquals(10,queue.popBack());
		assertEquals(3, queue.count());
		assertEquals(12, queue.front());
		assertEquals(4, queue.back());
	}
	
	@Test
	public void buildQueue() {
		queue.pushBack(10);
		queue.pushBack(12);
		queue.pushBack(14);
		queue.pushBack(4);
	}

}
