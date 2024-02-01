package refactor;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Variable para guardar el nombre del alumno
		String alumno;

		// Variables para guardar los distintos tipos de notas
		int notaPractica, notaProblemas, notaTeoria;

		// Creamos constantes para las ponderaciones
		final double PORCENTAJE_PRACTICA = 0.1;
		final double PORCENTAJE_PROBLEMAS = 0.5;
		final double PORCENTAJE_TEORIA = 0.4;

		// Variable donde guardaremos la nota final
		double notaFinal;

		// Opción para el menú
		int opcion;

		// Variables para la nota máxima, mínima y media
		double max = 0, min = 10, media = 0;

		// Variable que cuenta los alumnos
		int contador = 0;

		// Creamos el Scanner
		Scanner leer = new Scanner(System.in);

		while (true) {
			System.out.println("Introduzca el nombre del alumno");
			alumno = leer.next();

			if (alumno.equals("0")) {
				break;
			}

			System.out.println("Introduzca la nota de la práctica");
			notaPractica = leer.nextInt();
			if (notaPractica < 0 || notaPractica > 10) {
				System.out.println("ERROR: alguna de las notas introducidas no es correcta");
				continue;
			}
			System.out.println("Introduzca la nota de problemas");
			notaProblemas = leer.nextInt();
			if (notaProblemas < 0 || notaProblemas > 10) {
				System.out.println("ERROR: alguna de las notas introducidas no es correcta");
				continue;
			}
			System.out.println("Introduzca la nota de teoría");
			notaTeoria = leer.nextInt();
			if (notaTeoria < 0 || notaTeoria > 10) {
				System.out.println("ERROR: alguna de las notas introducidas no es correcta");
				continue;
			}
			notaFinal = notaPractica * PORCENTAJE_PRACTICA + notaProblemas * PORCENTAJE_PROBLEMAS
					+ notaTeoria * PORCENTAJE_TEORIA;
			System.out.println("La nota final de " + alumno + " es " + notaFinal);

			if (notaFinal > max) {
				max = notaFinal;
			}
			if (notaFinal < min) {
				min = notaFinal;
			}
			media += notaFinal;
			contador++;

			
		} // fin bucle

		media = media / contador;

		System.out.println("Seleccione una opción");
		System.out.println("1. Nota máxima");
		System.out.println("2. Nota mínima");
		System.out.println("3. Media de las notas");

		opcion = leer.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("La nota máxima es: " + max);
			break;
		case 2:
			System.out.println("La nota mínima es: " + min);
			break;
		case 3:
			System.out.println("La media de las notas es: " + media);
			break;
		default:
			System.out.println("La opción introducida no es válida");
		}

		leer.close();
	} // fin main

} // fin clase
