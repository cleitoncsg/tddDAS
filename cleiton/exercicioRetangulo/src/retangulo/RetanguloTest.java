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
		retangulo.setXmin(1);
		retangulo.setYmin(1);
		retangulo.setXmax(2);
		retangulo.setYmax(2);
		
		assertTrue(retangulo.verificaSeEhRetangulo());
	}

	
}
