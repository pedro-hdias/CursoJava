import java.util.Scanner;

public class CalculaVolumeCilindro {
	public static void main(String[] args) {
		int raio, altura;
		double volume;
		double py = 3.14;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo � calculadora de volume de cil�ndro.\nDigite o raio:");
		raio = teclado.nextInt();
		System.out.println("Agora, digite a altura: ");
		altura = teclado.nextInt();
		volume = py * raio * raio * altura;
		System.out.printf("O volume �: %.2f", volume);
	}

}
