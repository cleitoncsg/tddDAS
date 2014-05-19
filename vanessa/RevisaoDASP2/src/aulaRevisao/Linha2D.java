package aulaRevisao;

import java.util.ArrayList;

public class Linha2D {

	ArrayList<Integer> cadastroPontoA = new ArrayList<Integer>();
	ArrayList<Integer> cadastroPontoB = new ArrayList<Integer>();
	
	public String interseccao() {
		String resposta = "nada";

		if ( (cadastroPontoA.get(0) == cadastroPontoB.get(0) || cadastroPontoA.get(1) == cadastroPontoB.get(1)) ){
		    resposta = "encontrado";	  
		}
		
		return resposta;
	}
	
	public void pontoA(int x, int y){
		cadastroPontoA.add(x);
		cadastroPontoA.add(y);
	}
	
	public void pontoB(int x, int y){
		cadastroPontoB.add(x);
		cadastroPontoB.add(y);
	}
}
	