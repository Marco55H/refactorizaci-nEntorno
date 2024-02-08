package examen;

public class Oca {
	static final int TAMCIRCUITO = 11;
	static int ficha_j1 = 0, ficha_j2 = 0;
	static int minDado, maxDado;

	static int tiraDados() {
		int resultado = (int) (Math.random() * (maxDado - minDado + 1) + minDado);
		return resultado;
	}

	static String pintaPista() {
		String pista = "";
		for (int i = 1; i <= TAMCIRCUITO; i++) {
			pista += "\t" + i;
		}

		pista += "\n";

		for (int i = 1; i <= ficha_j1; i++) {
			pista += "\t";
		}
		pista += "J1\n";

		for (int i = 1; i <= ficha_j2; i++) {
			pista += "\t";
		}
		pista += "J2\n";
		return pista;
	}

	static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {
		boolean esPrimo = true;
		int suma = tirada1 + tirada2;

		if (suma <= 1) {
			return false;
		} else {
			for (int i = 2; i <= suma / 2; i++) {
				if (suma % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	String imprimeComoVaLaCarrera(String nomJ1, String nomJ2) {
		String ganador = "";

		if (ficha_j1 > ficha_j2) {
			ganador += "Va ganando " + nomJ1 + "\n";
		} else if (ficha_j2 > ficha_j1) {
			ganador += "Va ganando " + nomJ2 + "\n";
		} else {
			ganador += "VAN EMPATADOS" + "\n";
		}
		return ganador;
	}

	String esGanador(String nomJ1, String nomJ2) {
		String ganador = "";

		if (ficha_j1 >= TAMCIRCUITO) {
			ganador = nomJ1;
		} else if (ficha_j2 >= TAMCIRCUITO) {
			ganador = nomJ2;
		}

		return ganador;
	}

}
