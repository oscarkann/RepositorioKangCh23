package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in);

	public void cicloW() {
		int iterador = 0;
		while (iterador < 10) {

			System.out.println("iterador " + iterador);
			iterador = iterador + 1;
		}

	}

	/* while uso centinela */
	public void centinelaW() {

		final int centinela = -1;
		System.out.print("Introduzca un Nota: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La Nota es: " + nota);
			System.out.println("Introduzca una Nota: ");
			nota = entrada.nextInt();
		}
		System.out.println("Fin");

	}

	public void banderaW() {
		
		boolean valorb = false;
		while (!valorb) {
			System.out.println("Introduzca un valor numerico");
			int valorx = entrada.nextInt();
			
			if (valorx >= 0 && valorx <= 5) {
				int potaxio = (int) Math.pow(valorx, 2);
				System.out.println("el resultado --> "+ potaxio);
			} else {
				valorb = true;
				System.out.println("No queride");

			}
			
			
		}		
		
		
		
		
		
		
		
		//Math.pow(2, 2);
	
	}

}