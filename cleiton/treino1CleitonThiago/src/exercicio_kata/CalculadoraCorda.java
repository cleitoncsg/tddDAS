package exercicio_kata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculadoraCorda {
	
	ArrayList<String> calcCorda = new ArrayList<String>();

	public int Add(String string1) {
		
		if(Integer.parseInt(string1) < 0)
			throw new IllegalArgumentException();
		
		else{
			calcCorda.add(string1);
			
			System.out.println(calcCorda);
			if(string1 == "")
				return 0;
			
			return Integer.parseInt(string1);
		}
	}

	public int produto() {
		int produto = 1, j = 0;
		Iterator<String> i = calcCorda.iterator();
		
	    while(i.hasNext()) {  // Se tiver próximo
	      System.out.println(Integer.parseInt (i.next()));  // Imprime o próximo
	      produto = produto*Integer.parseInt(calcCorda.get(j));
	      j++;
	    }
			
		return produto;
	}

}
