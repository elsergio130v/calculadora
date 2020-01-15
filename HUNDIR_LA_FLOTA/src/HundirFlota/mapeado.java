package HundirFlota;

public class mapeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generarMapa();
	}

	public static String[][] generarMapa() {
		int size = 10;
		String[] posicion = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		String[] posicion2 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[][] mapa = new String[size][size];
		for (int i = 0; i < posicion.length; i++) {
			if (i == 0) {
				System.out.print("\t");
			}

			System.out.print(posicion[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < mapa.length; i++) {
			System.out.print(posicion2[i] + "\t");
			for (int j = 0; j < mapa[i].length; j++) {
				mapa[i][j] = "0";
				System.out.print(mapa[i][j] + "\t");
			}
			System.out.println();
		}
		return mapa;
	}
}