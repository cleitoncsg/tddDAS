package retangulo;

public class Retangulo {


	public boolean verificaSeEhRetangulo(double xmin,double ymin,double xmax,double ymax) {
		
		if( (ymax - ymin) > 0 && (xmax - xmin) > 0)
			return true;
		return false;
	}
	

}
