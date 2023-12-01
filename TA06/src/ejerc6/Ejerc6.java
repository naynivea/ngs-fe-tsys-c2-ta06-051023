/**
 * 
 */
package ejerc6;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seguir = true;
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Entra un nmero entero positivo"));
		while (seguir) {
			if (num < 0) {
				num = Integer.parseInt(
						JOptionPane.showInputDialog("Nmero invalido, entrar un numero positivo y de valor entero"));
			} else {
				seguir = false;
			}
		}

		JOptionPane.showMessageDialog(null, comptarCifras(num));
	}

	public static int comptarCifras(int num) {
		String text_num = Integer.toString(num);
		int longitud = text_num.length();

		return longitud;
	}

}
