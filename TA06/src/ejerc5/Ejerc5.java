/**
 * 
 */
package ejerc5;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int decimal = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce un valor decimal para convertirlo a binario"));

		System.out.println(convertirDecimalBinario(decimal));
	}

	public static String convertirDecimalBinario(int decimal) {
		String resultado = "";
		boolean seguir = true;
		while (seguir) {
			if (decimal / 2 > 0) {
				resultado += Integer.valueOf(decimal % 2);
				decimal /= 2;
			} else {
				resultado += Integer.valueOf(decimal % 2);
				seguir = false;
			}
		}
		StringBuffer sbuf = new StringBuffer(resultado);
		resultado = sbuf.reverse().toString();
		return resultado;
	}

}
