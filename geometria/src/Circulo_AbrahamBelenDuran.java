
/**
 * @author Abraham belén Durán
 * @version 1.2
 */
public class Circulo_AbrahamBelenDuran extends FiguraGeometrica_AbrahamBelenDuran {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	/**
	 * @param r
	 * @param tipoFigura
	 * Es el constructor de la clase
	 */
	public Circulo_AbrahamBelenDuran(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
	}

	/**
	 * Calcula el area del circulo
	 * @return Devuelve el area del circulo
	 */
	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	/**
	 * Calcula el perimetro del del circulo
	 * @return Devuelve el perimetro del circulo
	 */
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
