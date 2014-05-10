package Passo1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	
	Pessoa pessoa = new Pessoa(); 

	@Test
	public void test() {
		pessoa.setNome("thiago");
		assertEquals("thiago", pessoa.getNome());
		
	}

}
