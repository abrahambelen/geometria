import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCirculo_AbrahamBelenDuran {

	@Test
	void test() {
		Circulo_AbrahamBelenDuran miCirculo = new Circulo_AbrahamBelenDuran(7, "Circulo");
		miCirculo.area();
		miCirculo.perimetro();
		Circulo_AbrahamBelenDuran miCirculo2 = new Circulo_AbrahamBelenDuran(0, "Circulo");
		miCirculo2.area();
		miCirculo2.perimetro();
		Circulo_AbrahamBelenDuran miCirculo3 = new Circulo_AbrahamBelenDuran(-3, "Circulo");
		miCirculo3.area();
		miCirculo3.perimetro();
	}

}
