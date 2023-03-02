package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);

	public void vocal() {
		System.out.println("Introduzca una letra: ");

		char letra = dato.next().charAt(0);
		switch (letra) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println(" es vocal ");
			break;

		default:
			System.out.println("El caracter no es vocal" + letra);
			break;

		}
	}

	public void notas() {
		// TODO Auto-generated method stub

		System.out.print("Introduzca calificacion ");

		int nota = dato.nextInt();
		switch (nota) {
		case 10:
			System.out.println("Excelente");
			break;
		case 9:
			System.out.println("Muy Bueno");
			break;
		case 8:
			System.out.println("Bueno");
			break;
		case 7:
			System.out.println("Regular");
			break;
		case 6:
			System.out.println("Deficiente");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobado");

			break;

		default:
			System.out.println("Fuera de rango");
			break;

		}
	}

	// OPERADOR ELVIS o TERNARIO
	// VARIABLE = (PL) ? entrada verdad : entrada falso
	public void ternario() {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero: ");

		int entradaV = dato.nextInt();
		System.out.println("Introduzca un segundo valor numerico: ");

		int entradaF = dato.nextInt();
		int menor = (entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("----> " + menor);
	}

}
