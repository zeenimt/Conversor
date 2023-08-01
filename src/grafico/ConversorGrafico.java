package grafico;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorGrafico {

	private static double usd = 0.21;
	private static double usdToBrl = 4.72;
	private static double kz = 174.55;
	private static double kzToBrl = 0.0057;
	private static double ars = 57.60;
	private static double arsToBrl = 0.017;
	private static int fahrenheit = 32;

	private static double result;

	public static void main(String[] args) {

		Object[] begin = { "Conversor de Moeda", "Conversor de Medida", "Conversor de Temperatura" };
		Object frameSelect = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, begin, begin[0]);
		DecimalFormat df = new DecimalFormat("0.00");

		if (frameSelect == begin[0]) {

			Object selectConverter[] = { "BRL --> USD", "USD --> BRL", "BRL --> KZ", "KZ --> BRL", "BRL --> ARS",
					"ARS --> BRL" };
			Object converter = JOptionPane.showInputDialog(null, "Escolha uma das opções:", "Moedas",
					JOptionPane.INFORMATION_MESSAGE, null, selectConverter, selectConverter[0]);
			String userValue = JOptionPane.showInputDialog("Digite um valor a ser convertido:");

			if (userValue.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Retornando para o começo do programa...");
				main(null);
			}

			double value = Double.parseDouble(userValue);

			if (converter == selectConverter[0]) {
				result = value * usd;
				String resultFormatted = df.format(result);
				JOptionPane.showConfirmDialog(null, "O valor convertido foi de $" + resultFormatted);
			} else if (converter == selectConverter[1]) {
				result = value * usdToBrl;
				String resultFormatted = df.format(result);
				JOptionPane.showConfirmDialog(null, "O valor convertido foi de R$" + resultFormatted);
			} else if (converter == selectConverter[2]) {
				result = value * kz;
				String resultFormatted = df.format(result);
				JOptionPane.showConfirmDialog(null, "O valor convertido foi de Kz" + resultFormatted);
			} else if (converter == selectConverter[3]) {
				result = value * kzToBrl;
				String resultFormatted = df.format(result);
				JOptionPane.showConfirmDialog(null, "O valor convertido foi de R$" + resultFormatted);
			} else if (converter == selectConverter[4]) {
				result = value * ars;
				String resultFormatted = df.format(result);
				JOptionPane.showConfirmDialog(null, "O valor convertido foi de $" + resultFormatted);
			} else if (converter == selectConverter[5]) {
				result = value * arsToBrl;
				String resultFormatted = df.format(result);
				JOptionPane.showConfirmDialog(null, "O valor convertido foi de R$" + resultFormatted);
			}

		}

		if (frameSelect == begin[1]) {

			Object selectConverter[] = { "Cm --> M", "M --> Cm", "M --> Km", "Km --> M" };
			Object converter = JOptionPane.showInputDialog(null, "Digite um número a ser convertido", "Medidas",
					JOptionPane.INFORMATION_MESSAGE, null, selectConverter, selectConverter[0]);
			String userValue = JOptionPane.showInputDialog("Digite um valor a ser convertido:");

			double value = Double.parseDouble(userValue);

			if (userValue.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Retornando para o começo do programa...");
				main(null);
			}

			if (converter == selectConverter[0]) {
				result = value / 100;
				JOptionPane.showMessageDialog(null, "Valor convertido para " + result + "M.");
			} else if (converter == selectConverter[1]) {
				result = value * 100;
				JOptionPane.showMessageDialog(null, "Valor convertido para " + result + "Cm.");
			} else if (converter == selectConverter[2]) {
				result = value / 1000;
				JOptionPane.showMessageDialog(null, "Valor convertido para " + result + "Km.");
			} else if (converter == selectConverter[2]) {
				result = value * 1000;
				JOptionPane.showMessageDialog(null, "Valor convertido para " + result + "Km.");
			}
		}

		if (frameSelect == begin[2]) {

			Object selectConverter[] = { "°C --> °F", "°F --> °C", "°C --> K", "K --> °C", "K --> °F", "°F --> K" };
			Object converter = JOptionPane.showInputDialog(null, "Digite um número a ser convertido", "Medidas",
					JOptionPane.INFORMATION_MESSAGE, null, selectConverter, selectConverter[0]);
			String userValue = JOptionPane.showInputDialog("Digite um valor a ser convertido:");

			double value = Double.parseDouble(userValue);

			if (userValue.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Retornando para o começo do programa...");
				main(null);
			}

			if (converter == selectConverter[0]) {
				result = (value * 9 / 5) + fahrenheit;
				JOptionPane.showMessageDialog(null, "Valor convertido de °C para °F" + result);
			} else if (converter == selectConverter[1]) {
				result = (value - fahrenheit) * 5 / 9;
				JOptionPane.showMessageDialog(null, "Valor convertido de °F para °C" + result);
			} else if (converter == selectConverter[2]) {
				result = value + 273.15;
				JOptionPane.showMessageDialog(null, "Valor convertido de °C para K" + result);
			} else if (converter == selectConverter[3]) {
				result = value - 273.15;
				JOptionPane.showMessageDialog(null, "Valor convertido de K para °C" + result);
			} else if (converter == selectConverter[4]) {
				result = (value - 273.15) * 9 / 5 + 32;
				JOptionPane.showMessageDialog(null, "Valor convertido de K para °F" + result);
			} else if (converter == selectConverter[4]) {
				result = (value - fahrenheit) * 5 / 9 + 273.15;
				JOptionPane.showMessageDialog(null, "Valor convertido de °F para K" + result);
			}
		}

	}

}
