import java.util.Scanner;

public class CalculaAreaTriangulo {
	public static void main(String[] args) {
		double areaTotal, base, altura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo � calculadora de �rea triangular;\nDigite, por favor a base deste tri�ngulo:");
		base = teclado.nextDouble();
		System.out.println("Digite agora a altura do tri�ngulo: ");
		altura = teclado.nextDouble();
		areaTotal = (base * altura) / 2;
		System.out.printf("A �rea total deste tri�ngulo �: %.2f", areaTotal);
		teclado.close();
	}

}
