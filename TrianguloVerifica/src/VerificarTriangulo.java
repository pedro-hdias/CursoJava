import java.util.Scanner;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int lado1, lado2, lado3;
		System.out.println("Seja bem-vindo ao verificador de triângulo.\nDigite o lado 1 do triângulo.");
		lado1 = teclado.nextInt();
		System.out.println("Digite agora o lado 2:");
		lado2 = teclado.nextInt();
		System.out.println("Agora, o lado 3.");
		lado3 = teclado.nextInt();
		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Legal, é um triângulo e é do tipo equilátero.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("É um triângulo do tipo Isóceles.");
			} else {
				System.out.println("É um triângulo e é do tipo escaleno.");
			}
		} else {
			System.out.println("Não é triângulo.");
		}
		teclado.close();
	}
}
