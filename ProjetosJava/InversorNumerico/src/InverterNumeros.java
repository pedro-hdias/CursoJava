import java.util.Scanner;

public class InverterNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numOriginal, result1, result2, result3, result4, result5, result6, result7, result8;
		System.out.println("Seja bem-vindo ao inversor numérico.\nDigite um número para inverter, de 3 caracteres.");
		numOriginal = teclado.nextInt();
		result1 = numOriginal %10;
		result2 = numOriginal / 10;
		result3 = result2 % 10;
		result4 = result2 / 10;
		System.out.println("O inverso é: " + result1 + result3 + result4);
	}

}
