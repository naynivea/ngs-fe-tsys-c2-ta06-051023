/**
 * 
 */
package ejerc12;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamano del array"));
		String numero = JOptionPane.showInputDialog("Con que digito quieres que acaben los numeros?");
		int[] array = new int[size];
		int[] arrayFinal = rellenarArray(array, numero);
		for (int i = 0; i < arrayFinal.length; i++) {
			System.out.print(arrayFinal[i] + " ");
		}

	}

	public static int[] rellenarArray(int[] array, String numero) {
		int[] arrayFinal = new int[array.length];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(300) + 1;
			String cadena_num = Integer.toString(array[i]);
			if (cadena_num.endsWith(numero)) {
				arrayFinal[i] = array[i];
			}
		}
		return arrayFinal;
	}

}
