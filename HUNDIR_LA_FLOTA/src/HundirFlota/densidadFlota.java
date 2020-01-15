package HundirFlota;

public class densidadFlota {
	public static char densidadFlota() {
		System.out.println("elige entre estas opciones");
		System.out.println("A - facil(40%)");
		System.out.println("B - medio(30%)");
		System.out.println("C - dificil(10%)");

		char densidad = utilidades.Leer.letra();
		if (densidad == 'A') {
			System.out.println("densidad=bajo");
			

		} else {
			if (densidad == 'B') {
				System.out.println("densidad=media");

			} else {
				if (densidad == 'C') {
					System.out.println("densidad=alto");

				}
			}

//			System.out.println("densidad= "+densidad);
		}
		return densidad;
	}

}
