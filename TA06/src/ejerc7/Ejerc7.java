/**
 * 
 */
package ejerc7;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String moneda = "";
		boolean seguir = true;

		while (seguir) {
			moneda = JOptionPane
					.showInputDialog("Elige a que moneda quieres convertir \n" + "Libra \n" + "Dolar \n" + "Yenes \n")
					.toLowerCase();
			if (moneda.equals("libra") || moneda.equals("dolar") || moneda.equals("yenes")) {
				seguir = false;
			} else {
				JOptionPane.showMessageDialog(null, "Valor invalido");
			}
		}
		double valorEuro = Double.parseDouble(JOptionPane.showInputDialog("Entra el valor en euro"));
		convertirMoneda(moneda, valorEuro);
	}

	public static void convertirMoneda(String moneda, double valorEuro) {
		switch (moneda) {
		case "libra":
			JOptionPane.showMessageDialog(null, valorEuro * 0.86 + " ");
			break;
		case "dolar":
			JOptionPane.showMessageDialog(null, valorEuro * 1.28611 + " $");
			break;
		case "yenes":
			JOptionPane.showMessageDialog(null, valorEuro * 129.852 + " ");
			break;
		}
	}

}
