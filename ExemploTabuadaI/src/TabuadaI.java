import java.util.Scanner;

public class TabuadaI {
	public static void main(String[] args) {
		 Scanner inputKeyboard = new Scanner(System.in);
		int number, counter, result;
		counter = 0;
		System.out.println("Calcular tabuada, digite um número para multiplicar.");
		number = inputKeyboard.nextInt();
		while (true) {
			System.out.println("O resultado de " + number + " vezes " + counter + " é igual " + number * counter);
			counter ++;
		}
		// inputKeyboard.close();
	}
}
