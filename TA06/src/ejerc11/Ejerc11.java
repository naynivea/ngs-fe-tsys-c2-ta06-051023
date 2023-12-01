/**
 * 
 */
package ejerc11;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(JOptionPane.showInputDialog("Entra el tamao del array"));
		int[] array1 = new int[size];
		rellenarArray(array1);
		int[] array2 = array1.clone();
		rellenarArray(array2);
		int[] array3 = multiplicarArrays(array1, array2);

		System.out.print("Array 1: ");
		mostrarArray(array1);

		System.out.println();
		System.out.print("Array 2: ");
		mostrarArray(array2);

		System.out.println();
		System.out.print("Array 3: ");
		mostrarArray(array3);

	}

	public static void rellenarArray(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50) + 1;
		}

	}

	public static int[] multiplicarArrays(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] * array2[i];
		}

		return array3;
	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
