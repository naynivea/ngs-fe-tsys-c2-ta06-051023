/**
 * 
 */
package ejerc2;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cantidadNumeros = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce la cantidade que quieres generar"));
		int min = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el rango min"));
		int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el rango max"));

		String resultado = "";
		for (int i = 0; i < cantidadNumeros; i++) {
			resultado += String.valueOf(generarAleatorio(min, max)) + " ";
		}

		JOptionPane.showMessageDialog(null, resultado);
	}

	public static int generarAleatorio(int min, int max) {
		int aleatorio = (int) (Math.random() * min + max);
		return aleatorio;

	}

}
