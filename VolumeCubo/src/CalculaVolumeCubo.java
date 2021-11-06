import java.util.Scanner;

public class CalculaVolumeCubo {

	public static void main(String[] args) {
		double volume, lado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo à calculadora de volume de um cubo.\nDigite o tamanho do lado.");
		lado = teclado.nextDouble();
		volume = lado * lado * lado;
		System.out.printf("O volume deste cubo é: %.2f", volume);
teclado.close();
	}

}
