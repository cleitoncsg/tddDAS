package Passo1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	
	Pessoa pessoa = new Pessoa(); 

	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(pessoa.setNome("thiago"), pessoa.getNome());
		
	}

}
