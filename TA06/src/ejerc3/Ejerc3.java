/**
 * 
 */
package ejerc3;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc3 {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Dime un nmero y te dir si es primo o no"));
		JOptionPane.showMessageDialog(null, esPrimo(numero));

	}

	public static String esPrimo(int numero) {
		int divisores = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			return "Es primo";
		} else {
			return "No es primo";
		}
	}
}
