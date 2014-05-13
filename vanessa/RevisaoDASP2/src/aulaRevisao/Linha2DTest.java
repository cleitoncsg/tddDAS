package aulaRevisao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Linha2DTest {
	
	Linha2D linha2D = new Linha2D();
	
	@Test
	public void testInterseccao() {
		linha2D.pontoA(0, 2);
		linha2D.pontoB(2, 2);
	
		assertEquals("encontrado",linha2D.interseccao() );
	}

}
