import java.util.HashMap;


public class ConversordeRomanos {
	
	private static HashMap<Character, Integer> tabela = new HashMap<Character,Integer>(){{
		put('I',1);
		put('V',5);
		put('X',10);
		put('L',50);
		put('C',100);
		put('D',500);
		put('M',1000);
	}};

	public int converte(String algarismo) {
		
		int acumulador = 0;
		int ultimoVizinhoDaDireita = 0;
		
		for (int i = algarismo.length()-1; i >= 0; i--){
			//pega o inteiro referente ao símbolo atual
			
			int atual = tabela.get(algarismo.charAt(i));
			
			// se o da direita for menor multiplicaremos por menos 1
			
			int multiplicador = 1;
			
			if (atual < ultimoVizinhoDaDireita)
				multiplicador = -1;
			
				acumulador = acumulador + tabela.get(algarismo.charAt(i))*multiplicador;
				
				ultimoVizinhoDaDireita = atual;
					
		}

		return acumulador ;
	}

}
