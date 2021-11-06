import java.util.Scanner;

public class CalculaTabuadaIII {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		int number, result;
		System.out.println("Digite um número para multiplicar: ");
		number = inputKeyboard.nextInt();
		for (int i = 0; i <= 10; i ++) {
			System.out.println("O resultado de " + number + " vezes " + i + " é: " + number * i);
		}
		inputKeyboard.close();
	}
}
