
/**
 * @author Abraham Belén Durán
 * @version 1.2
 */
public class Rectangulo_AbrahamBelenDuran extends FiguraGeometrica_AbrahamBelenDuran {
	private double l1;
	private double l2;
	
	/**
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 * Es el constructor de la clase
	 */
	public Rectangulo_AbrahamBelenDuran(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el area del rectangulo
	 * @return Devuelve el area del rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Clacula el perimetro del rectangulo
	 * @return Devuelve el perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
