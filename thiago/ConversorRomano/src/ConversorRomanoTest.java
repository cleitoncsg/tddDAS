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

}
