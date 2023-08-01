package comando;

import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {

		Scanner inputUser = new Scanner(System.in);
		int input = 0;

		while (input != 9) {

			Conversor.exibirMenu();
			input = inputUser.nextInt();

			switch (input) {
			case 1:
				Conversor.conversor("BRL", "USD", 0.21, inputUser, "$");
				break;
			case 2:
				Conversor.conversor("USD", "BRL", 4.72, inputUser, "R$");
				break;
			case 3:
				Conversor.conversor("BRL", "KZ", 174.55, inputUser, "R$");
				break;
			case 4:
				Conversor.conversor("KZ", "BRL", 0.0057, inputUser, "R$");
				break;
			case 5:
				Conversor.conversor("BRL", "ARS", 57.60, inputUser, "R$");
				break;
			case 6:
				Conversor.conversor("ARS", "BRL", 0.017, inputUser, "R$");
				break;
			case 9:
				System.out.println("Sentirei sua falta...");
				break;
			default:
				System.out.println("Digite uma opção válida, por favor!");
			}
		}
		inputUser.close();

	}

}
