import java.util.Scanner;

public class CalculaNotas {
public static void main(String[] args) {
	double n1, n2, media;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Seja bem-vindo ao Caucula notas. \n Voc� dever� digitar duas notas para calcular sua m�dia. \n Primeiro, sua primeira nota:");
	n1 = teclado.nextDouble();
	System.out.println("Agora, sua segunda nota: ");
	n2 = teclado.nextDouble();
	media = (n1 + n2) / 2;
	System.out.printf("Pronto, calculei a m�dia das suas notas. O resultado foi %f", media);
}
}
