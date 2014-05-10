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
		
		for (int i =0; i < algarismo.length(); i++){
					
		acumulador = acumulador + tabela.get(algarismo.charAt(i));
					
		}

		return acumulador ;
	}

}
