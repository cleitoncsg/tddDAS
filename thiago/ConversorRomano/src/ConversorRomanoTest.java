import static org.junit.Assert.*;

import org.junit.Test;


public class ConversorRomanoTest {

	@Test
	public void converteOSimboloI() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("I");
		
		assertEquals(1, retorno);
	}
	
	@Test
	public void converteOSimboloV() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("V");
		
		assertEquals(5, retorno);
	}
	
	@Test
	public void converteOSimboloX() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("X");
		
		assertEquals(10, retorno);
	}
	

	@Test
	public void converteOSimboloII() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("II");
		
		assertEquals(2, retorno);
	}
	
	@Test
	public void converteOSimboloXXII() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("XXII");
		
		assertEquals(22, retorno);
	}
	
	@Test
	public void converteOSimboloIV() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("IV");
		
		assertEquals(4, retorno);
	}

}
