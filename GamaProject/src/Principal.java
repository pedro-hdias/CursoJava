import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double a, b, c, d;
		Scanner inputKeyboard = new Scanner(System.in);
		System.out.println("Ol�, vou calcular sua m�dia.\nDigite sua nota 1:");
		a = inputKeyboard.nextDouble();
		System.out.println("Agora a nota 2:");
		b = inputKeyboard.nextDouble();
		System.out.println("Agora a nota 3:");
		c = inputKeyboard.nextDouble();
		System.out.println("Por �ltimo mas n�o menos reprovante, sua nota 4: ");
		d = inputKeyboard.nextDouble();
		System.out.printf("Maravilha! Com base nas suas notas, sua m�dia foi: %.2f", MediaCalcule.media(a, b, c, d));
		inputKeyboard.close();
	}

}
