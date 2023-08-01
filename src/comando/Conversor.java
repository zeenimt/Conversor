package comando;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {

	public static void exibirMenu() {

		System.out.println("====================================");
		System.out.println("Boas Vindas Ao Conversor de Moedas!");
		System.out.println("Escolha umas das opções a seguir: ");
		System.out.println("1 - BRL --> USD");
		System.out.println("2 - USD --> BRL");
		System.out.println("3 - BRL --> KZ");
		System.out.println("4 - KZ --> BRL");
		System.out.println("5 - BRL --> ARS");
		System.out.println("6 - ARS --> BRL");
		System.out.println("9 - Sair do programa");
		System.out.println("====================================");

	}

	public static void conversor(String uniOri, String uniDest, double proporcao, Scanner leitor, String simbolo) {
		System.out.println("Você escolheu: " + uniOri + " --> " + uniDest);
		System.out.println("Digite o valor a ser convertido: ");

		String valueString = leitor.next();
		valueString = valueString.replace(",", ".");

		double value = Double.parseDouble(valueString);

		DecimalFormat df = new DecimalFormat("0.00");
		String finalValue = df.format(value * proporcao);


		System.out.println("Valor convertido: " + simbolo + " " + finalValue);

	}
}
