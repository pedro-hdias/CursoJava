import java.util.Scanner;

public class CalculaVolumeCilindro {
	public static void main(String[] args) {
		int raio, altura;
		double volume;
		double py = 3.14;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo à calculadora de volume de cilíndro.\nDigite o raio:");
		raio = teclado.nextInt();
		System.out.println("Agora, digite a altura: ");
		altura = teclado.nextInt();
		volume = py * raio * raio * altura;
		System.out.printf("O volume é: %.2f", volume);
	}

}
