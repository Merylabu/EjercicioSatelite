
public class Satelite {
	public double meridiano;
	public double paralelo;
	public double distancia_tierra;


	public Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	public Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	public void printPosicion() {
		System.out.println("El satélite se encuentra en el paralelo" + paralelo + "Meridiano" + meridiano
				+ "a una distancia de la tierra de" + distancia_tierra + "Kilómetros");
		
	}
	
	public void variaAltura (double desplazamiento) {
		this.meridiano += desplazamiento;
	}
}
