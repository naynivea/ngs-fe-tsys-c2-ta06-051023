/**
 * 
 */
package ejerc4;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc4 {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para calcular el factorial"));
		JOptionPane.showMessageDialog(null, calcularFactorial(numero));
	}

	public static int calcularFactorial(int numero) {
		int resultado = numero;
		for (int i = numero; i > 1; i--) {
			resultado *= i - 1;
		}
		return resultado;
	}

}
