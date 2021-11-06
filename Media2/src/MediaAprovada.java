import java.util.Scanner;

public class MediaAprovada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Seja bem-vindo(a) à calculadora de média.\nDigite sua  primeira nota.");
		nota1 = teclado.nextDouble();
		System.out.println("Agora, digite sua segunda nota:");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		if (media >= 9 && media <= 10) {
			System.out.println("PARABÉNS! SUA NOTA FOI CONSEITO A!");
		} else if (media >= 7.5 && media < 9) {
			System.out.println("Ótimo, sua nota foi conseito B!");
		} else if (media >= 6 && media < 7.5) {
			System.out.println("Legal, seu conseito foi C!");
		} else if (media >= 5 && media < 6) {
			System.out.println("Ah, sua nota foi conceito D");
		} else {
			System.out.println("Sinto muito, sua nota foi conseito F.");
		}
		teclado.close();
	}
}
