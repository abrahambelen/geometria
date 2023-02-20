
 
/**
 * @author Abraham Belén Durán
 * @version 1.2
 */
public class Triangulo_AbrahamBelenDuran extends FiguraGeometrica_AbrahamBelenDuran {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * @param tipoFigura
	 * @param lado1 
	 * @param lado2
	 * @param lado3
	 * Constructor de la clase
	 */
	public Triangulo_AbrahamBelenDuran(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * Calcula el perimetro del triangulo
	 * @return Devuelve la suma de los lados
	 */
	
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	/**
	 * Calcula el area con la formula de Her�n
	 * @return Devuelve el area
	 */
	@Override
	public double area() { //Utiliza la formula de Her�n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	

}
