import java.util.Scanner;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int lado1, lado2, lado3;
		System.out.println("Seja bem-vindo ao verificador de tri�ngulo.\nDigite o lado 1 do tri�ngulo.");
		lado1 = teclado.nextInt();
		System.out.println("Digite agora o lado 2:");
		lado2 = teclado.nextInt();
		System.out.println("Agora, o lado 3.");
		lado3 = teclado.nextInt();
		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Legal, � um tri�ngulo e � do tipo equil�tero.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("� um tri�ngulo do tipo Is�celes.");
			} else {
				System.out.println("� um tri�ngulo e � do tipo escaleno.");
			}
		} else {
			System.out.println("N�o � tri�ngulo.");
		}
		teclado.close();
	}
}
