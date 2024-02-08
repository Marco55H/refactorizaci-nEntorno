package examen;

import java.util.Scanner;

/**
 * public class Main {
 */
public class Main {
	/**
	 * El main
	 * @param args
	 */
	public static void main(String[] args) {
		// int tirada1, tirada2;
		String nomJ1, nomJ2;
		Oca objeto = new Oca();

		Scanner lectura = new Scanner(System.in);

		System.out.println("Dime el valor m�nimo del dado: ");
		Oca.minDado = lectura.nextInt();

		System.out.println("Dime el valor m�ximo del dado: ");
		Oca.maxDado = lectura.nextInt();

		System.out.println("Dime el nombre del jugador 1:");
		nomJ1 = lectura.next();

		System.out.println("Dime el nombre del jugador 2");
		nomJ2 = lectura.next();

		while (nomJ1.equals(nomJ2)) {
			System.out.println("Los nombres de los jugadores no pueden ser iguales");
			System.out.println("Dime el nombre del jugador 2");
			nomJ2 = lectura.next();
		}

		while (objeto.esGanador(nomJ1, nomJ2).equals("")) {
			realizarJugada(1, nomJ1, nomJ2);
			realizarJugada(2, nomJ1, nomJ2);
		}

		System.out.println("Ha ganado " + objeto.esGanador(nomJ1, nomJ2));
		lectura.close();
	}

	static void realizarJugada(final int numJugador, final String nomJ1, final String nomJ2) {
		int tirada1, tirada2;
		Scanner lectura = new Scanner(System.in);
		Oca objeto = new Oca();

		System.out.println("Introduzca un car�cter para continuar con el juego");
		lectura.next();

		System.out.println("Juega el jugador " + numJugador);

		tirada1 = Oca.tiraDados();
		System.out.println("El jugador " + numJugador + " ha sacado en la primera tirada: " + tirada1);

		tirada2 = Oca.tiraDados();
		System.out.println("El jugador " + numJugador + " ha sacado en la segunda tirada: " + tirada2);

		if (Oca.sumaDeNumerosEsPrimo(tirada1, tirada2)) {
			System.out.println("�TIRADA V��LIDA!");
			if (numJugador == 1) {
				Oca.ficha_j1 += tirada1 + tirada2;
			} else {
				Oca.ficha_j2 += tirada1 + tirada2;
			}
		} else {
			System.out.println("�TIRADA NO V��LIDA! No se suma la tirada");
		}

		System.out.println(Oca.pintaPista());
		System.out.println(objeto.imprimeComoVaLaCarrera(nomJ1, nomJ2)); // NOPMD by mholguin on 8/2/24 14:10

		// lectura.close();
	}
}
