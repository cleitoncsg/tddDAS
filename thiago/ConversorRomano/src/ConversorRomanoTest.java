import static org.junit.Assert.*;

import org.junit.Test;


public class ConversorRomanoTest {

	@Test
	public void converteOSimboloI() {
		ConversordeRomanos conversor = new ConversordeRomanos();
		
		int retorno = conversor.converte("I");
		
		assertEquals(1, retorno);
	}

}
