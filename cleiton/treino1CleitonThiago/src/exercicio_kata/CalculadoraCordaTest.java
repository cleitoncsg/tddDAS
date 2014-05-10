package exercicio_kata;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

public class CalculadoraCordaTest {

	
	private CalculadoraCorda calculadoraCorda = new CalculadoraCorda();
	
	@Test
	public void verificaStringNulaTest() {
		calculadoraCorda.Add("");
		assertEquals(0, calculadoraCorda.Add(""));
	}
	
	@Test
	public void verificaUmParametroTest() {
		calculadoraCorda.Add("1");
		assertEquals(1, calculadoraCorda.Add("1"));
	}
	
	@Test
	public void verificaDoisParametroTest() {
		calculadoraCorda.Add("2");
		calculadoraCorda.Add("3");
		assertEquals(1, calculadoraCorda.Add("1"));
		assertEquals(2, calculadoraCorda.Add("2"));
	}
	
	@Test
	public void verificaProdutoTest() {
		calculadoraCorda.Add("2");
		calculadoraCorda.Add("3");
		calculadoraCorda.Add("4");
		calculadoraCorda.Add("5");
		
		assertEquals(120, calculadoraCorda.produto());
		
		System.out.println(calculadoraCorda.produto());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void verificaNumeroNegativoTest() {
		calculadoraCorda.Add("-2");
		
		Assert.fail("Numero negativo foi enviado");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void verificaMaiorQueMilTest() {
		calculadoraCorda.Add("1001");
		
		Assert.fail("Numero maior que mil foi enviado");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void verificaCaracterInvalidoTest() {
		calculadoraCorda.Add("*");
		calculadoraCorda.Add("12");
		calculadoraCorda.Add("*");
		calculadoraCorda.Add("2");
		
		assertEquals(24, calculadoraCorda.produto());
	}
	
	@Test
	public void verificaContaComOperadorTest() {
		calculadoraCorda.AddComOperador("2");
		calculadoraCorda.AddComOperador("*");
		calculadoraCorda.AddComOperador("4");
		
		assertEquals(8, calculadoraCorda.produto());
		
		System.out.println(calculadoraCorda.produto());
	}

}
