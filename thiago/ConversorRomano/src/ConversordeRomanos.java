import java.util.HashMap;


public class ConversordeRomanos {
	
	private static HashMap<String, Integer> tabela = new HashMap<String,Integer>(){{
		put("I",1);
		put("V",5);
		put("X",10);
		put("L",50);
		put("C",100);
		put("D",500);
		put("M",1000);
	}};

	public int converte(String algarismo) {
		
		return tabela.get(algarismo);
	}

}
