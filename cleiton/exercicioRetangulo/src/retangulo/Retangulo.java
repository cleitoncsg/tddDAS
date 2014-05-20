package retangulo;

public class Retangulo {
	
	Ponto pontoA,pontoB;
	
	public boolean verificaSeEhRetangulo(double xmin,double ymin,double xmax,double ymax) {
		
		if( (ymax - ymin) > 0 && (xmax - xmin) > 0)
			return true;
		return false;
	}

	public double calculoPerimetro(double xmin,double ymin,double xmax,double ymax) {
		double perimetro = ( (ymax - ymin) + (xmax - xmin) )*2;
		return perimetro;
	}

	public double calculoArea(double xmin,double ymin,double xmax,double ymax) {
		double area = Math.pow( (ymax - ymin)*(xmax - xmin), 2);
		return area;
	}

	public boolean verificaSobrePosicao(Ponto pontoA, Ponto pontoB) {
		
		if(pontoA.getXmax() - pontoB.getXmax() > 0)
			return true;
		if(pontoA.getYmax() - pontoA.getYmax() > 0)
			return true;
		return false;
	}
}
