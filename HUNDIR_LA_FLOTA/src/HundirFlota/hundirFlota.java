package HundirFlota;

public class hundirFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] mapa = mapeado.generarMapa();
		char densidad = densidadFlota.densidadFlota();
		char colocacionFlota=colocacionFlota(mapeado.generarMapa(),densidadFlota.class );
		realizarDisparo();
		comprobarDisparoYregistrar();
		comprobarFlota();
		finalizarJuego();
	}



	}



	private static void realizarDisparo() {
		// TODO
	}

	private static void comprobarDisparoYregistrar() {
		// TODO
	}

	private static void comprobarFlota() {
		// TODO
	}

	private static void finalizarJuego() {
		// TODO
	}
}