/**
 * 
 */
package ejerc10;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamano del array"));
		int array[] = new int[size];
		rellenarArray(array);
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("El mayor es: " + array[size - 1]);
	}

	public static void rellenarArray(int array[]) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			boolean seguir = true;
			while (seguir) {
				int num = random.nextInt(50) + 0;
				if (esPrimo(num)) {
					array[i] = num;
					seguir = false;
				}
			}

		}
	}

	public static boolean esPrimo(int num) {
		int divisores = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		return (divisores == 2) ? true : false;
	}

}
