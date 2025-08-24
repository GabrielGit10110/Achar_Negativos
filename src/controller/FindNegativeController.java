package controller;

public class FindNegativeController {

	public static void negativeFinder(int[] array, int size) {

		// condição de parada:
		// indice ser menor do que 0
		if (size < 0) {
			System.out.println("Acabou...");
			return;
		}

		// se o valor atual for maior que 0 (positivo)
		// não exibe nada
		if (array[size] > 0) {
			negativeFinder(array, size - 1);
		} 
		// caso seja 
		// mostrar o valor
		else {
			System.out.println(array[size]);
			negativeFinder(array, size - 1);
		}

	}
}
