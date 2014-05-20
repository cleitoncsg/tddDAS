package tddConsole;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsoleTest {

	Console console;
	
	@Before
	public void setUp() throws Exception {
		console = new Console();
	}

	
	@Test
	public void calculosRetanguloTest() {
		assertTrue(console.menu());
		assertTrue(console.calculoRetangulo());
	}
	
	@Test
	public void calculosCirculoTest() {
		assertTrue(console.menu());
		assertTrue(console.calculoCirculo());
	}
}
