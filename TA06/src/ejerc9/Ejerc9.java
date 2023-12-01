/**
 * 
 */
package ejerc9;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(JOptionPane.showInputDialog("De que tamano quieres tu array?"));
		int array[] = new int[size];
		rellenarArray(array);
		mostrarArray(array);

	}

	public static void rellenarArray(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(9) + 0;
		}
	}

	public static void mostrarArray(int[] array) {
		int resultado = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			resultado += array[i];
		}
		System.out.println();
		System.out.print("Resultado: " + resultado);
	}

}
