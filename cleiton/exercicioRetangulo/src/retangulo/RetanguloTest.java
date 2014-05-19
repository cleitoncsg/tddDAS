package retangulo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RetanguloTest {

	Retangulo retangulo;
	
	@Before
	public void setUp() throws Exception {
		retangulo = new Retangulo();
	}

	@Test
	public void constroiRentagulotest() {
		
		assertTrue(retangulo.verificaSeEhRetangulo(0, 0, 1, 2) );
	}

	
}
