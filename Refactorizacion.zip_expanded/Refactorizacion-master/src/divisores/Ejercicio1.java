package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	private static final String NÚMERO_DE_DIVISORES = "Número de divisores: ";

	public static void main(String[] args) {
		int valor1;
		long numDivisores;
		Scanner lectura = new Scanner(System.in);
		
		valor1 = lectura.nextInt();
		numDivisores = primeDivisors(valor1);
		
		System.out.println(NÚMERO_DE_DIVISORES + numDivisores);
		lectura.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(int i=2; i<=number; i++) {
			boolean esDivisor = number%i==0;
			if(esDivisor && esPrimo(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		for(int i=2; i<numero; i++) {
			int modulo = numero%i;
			if(modulo == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
