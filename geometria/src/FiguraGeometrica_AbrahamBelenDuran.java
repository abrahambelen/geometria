
/**
 * @author Abraham Belén Durán
 * @version 1.2
 */
public abstract class FiguraGeometrica_AbrahamBelenDuran {

	protected String tipoFigura;

	/**
	 * @param tipoFigura
	 * Constructor de la clase
	 */
	public FiguraGeometrica_AbrahamBelenDuran(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	/**
	 * Clase abastracta area
	 * @return Devuelve area
	 */
	public abstract double area();
	
	/**
	 * Clase abstracta perimetro
	 * @return Devuelve perimetro
	 */
	public abstract double perimetro();

	/**
	 * @return Devuelve el tipo de figura
	 */
	public String getTipoFigura() {
		return tipoFigura;
	}

	/**
	 * @param tipoFigura
	 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	/**
	 * @return Devuelve el perimetro dividido entre dos
	 */
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}

}
