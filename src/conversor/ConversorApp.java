package conversor;

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
				Conversor.conversor("USD", "BRL", 4.73, inputUser, "R$");
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
