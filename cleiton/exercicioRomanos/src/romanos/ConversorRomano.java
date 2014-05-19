package romanos;

public class ConversorRomano {


	public String converterParaRomano(int numero) {
		String retorno = null;
		if(numero == 1){
			retorno = "I";
		}
		else if(numero == 2){
			retorno = "II";
		}
		else
			retorno = "III";
		
		return retorno;
	}
}
