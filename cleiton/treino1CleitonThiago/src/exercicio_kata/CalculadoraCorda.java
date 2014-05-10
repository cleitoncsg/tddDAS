package exercicio_kata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculadoraCorda {
	
	ArrayList<String> calcCorda = new ArrayList<String>();
	String[] numerosValidos  = {"0","1", "2", "3","4","5","6","7","8","9"};

	public int Add(String string1) {
		
		for(int c = 0; c < 10; c++){
			if(numerosValidos[c] != string1){
				throw new IllegalArgumentException();
			}
		}
		if(Integer.parseInt(string1) < 0)
			throw new IllegalArgumentException();
		else if(Integer.parseInt(string1) > 1000)
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

	public int AddComOperador(String stringComOperador) {
		calcCorda.add(stringComOperador);
		int produto = 0;
		
		if(calcCorda.get(1) == "*")
			produto = Integer.parseInt(calcCorda.get(0)) * Integer.parseInt(calcCorda.get(2));
		else if(calcCorda.get(1) == "/")
			produto = Integer.parseInt(calcCorda.get(0)) / Integer.parseInt(calcCorda.get(2));
		else if(calcCorda.get(1) == "+")
			produto = Integer.parseInt(calcCorda.get(0)) + Integer.parseInt(calcCorda.get(2));
		else if(calcCorda.get(1) == "-")
			produto = Integer.parseInt(calcCorda.get(0)) - Integer.parseInt(calcCorda.get(2));
		
		return produto;
	}

}
