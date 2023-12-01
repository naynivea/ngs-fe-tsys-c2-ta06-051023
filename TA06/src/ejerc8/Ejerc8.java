/**
 * 
 */
package ejerc8;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		rellenarArray(array);
		mostrarArray(array);

	}

	public static void rellenarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la posicion " + i));
		}
	}

	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
