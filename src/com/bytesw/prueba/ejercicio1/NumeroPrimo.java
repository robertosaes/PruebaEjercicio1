package com.bytesw.prueba.ejercicio1;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 1;
		int cont = 0;
		
		do {
			if (esNumeroPrimo(numero)) {
				System.out.println(numero + " es primo ");
				cont++;
			}
			numero++;
		} while (cont < 10);

	}

	public static boolean esNumeroPrimo(int numero) {
		
		int contador = 2;
		boolean primo = true;

		while ((primo) && (contador != numero)) {

			if (numero % contador == 0) {
				primo = false;
			}
			contador++;
		}
		
		return primo;
	}

}
