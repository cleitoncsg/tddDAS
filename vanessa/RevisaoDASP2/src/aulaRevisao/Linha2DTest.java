package aulaRevisao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Linha2DTest {
	
	Linha2D linhaA;
	Linha2D linhaB;
	
	@Test
	public void testInterseccao() {
		Ponto a = new Ponto(0,2);
		Ponto b = new Ponto(0,4);
		
		Ponto c = new Ponto(0,2);
		Ponto d = new Ponto(0,6);
		
		linhaA = new Linha2D(a,b);
		linhaB = new Linha2D(c,d);
		
		assertEquals("encontrado", linhaA.interseccao(linhaB));
	}

}
