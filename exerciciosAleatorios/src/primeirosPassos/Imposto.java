package primeirosPassos;

public class Imposto {

	public double calculoImpostoRenda(double fator) {
		double valorImpostoRenda = 10*fator;
		
		if(valorImpostoRenda  < 0)
			throw new IllegalArgumentException("Imposto de Renda negativo!");
		
		return valorImpostoRenda;
	}

}
