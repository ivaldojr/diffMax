package difference;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author ivaldo - 21/02/2019
 *
 */

public class Difference {

	static int maxDifference(int[] arr, int n) {
		int maxDiff = -1;
		int i, j;

		for (i = 0; i < n; ++i) { // Primeiro for utilizado para iterar um elemento com o proximo for.
			for (j = n - 1; j > i; --j) { //For onde ir� comparar elementos a partir a itera��o do for anterior.
				if (arr[j] > arr[i] && maxDiff < (arr[j] - arr[i])) // Se o elemento for maior que o anterior e a diferen�a dos dois � maior que a diferen�a atual, o maxDiff ser� trocado.
					maxDiff = arr[j] - arr[i];
			}
		}

		return maxDiff;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Recebendo o tamando do Array
		System.out.println("Digite a quantidade de elementos do Array: ");
		int n = sc.nextInt();
		// Populando Array com inteiros
		System.out.println("Digite os "+n+" elemento(s): ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("A diferen�a m�xima �: " + maxDifference(a, n));
	}

}
