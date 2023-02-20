
public class Circulo_AbrahamBelenDuran extends FiguraGeometrica_AbrahamBelenDuran {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_AbrahamBelenDuran(double r, String tipoFigura) {
		super(tipoFigura);
		
		if(r >=0 ) {
			radio = r;
			
		}else {
			radio =r*(-1);
		}
		
	
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
