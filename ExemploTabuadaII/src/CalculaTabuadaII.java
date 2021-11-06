import java.util.Scanner;

public class CalculaTabuadaII {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		int number, counter, result;
		counter = 0;
		System.out.println("Digite um número para multiplicar: ");
		number = inputKeyboard.nextInt();
		do {
			System.out.println("O resultado de " + number + " vezes " + counter + " é: " + number * counter);
			counter ++;
		} while (counter <=10);
		inputKeyboard.close();;
	} 
}
