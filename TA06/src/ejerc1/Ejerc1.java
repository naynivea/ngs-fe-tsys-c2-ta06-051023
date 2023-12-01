/**
 * 
 */
package ejerc1;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean seguir = true;

		while (seguir) {
			int figura = Integer.parseInt(JOptionPane.showInputDialog(
					"Que figura quieres calcular el rea? " + "1. Crculo" + "2. Cuadrado" + "3. Triangulo"));

			switch (figura) {
			case 1:
				seguir = false;
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del crculo"));
				JOptionPane.showMessageDialog(null, "El area del crculo es: " + calcularCirculo(radio));
				break;
			case 2:
				seguir = false;
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
				JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + calcularCuadrado(lado));
			case 3:
				seguir = false;
				double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
				JOptionPane.showMessageDialog(null, "El area del triangulo es: " + calcularTriangulo(base, altura));
			}
		}

	}

	public static double calcularCirculo(double radio) {

		return Math.PI * Math.pow(radio, 2);
	}

	public static double calcularTriangulo(double base, double altura) {

		return (base * altura) / 2;
	}

	public static double calcularCuadrado(double lado) {

		return lado * lado;
	}

}