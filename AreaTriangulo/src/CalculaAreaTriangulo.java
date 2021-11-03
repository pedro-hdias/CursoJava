import java.util.Scanner;

public class CalculaAreaTriangulo {
	public static void main(String[] args) {
		double areaTotal, base, altura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo à calculadora de área triangular;\nDigite, por favor a base deste triângulo:");
		base = teclado.nextDouble();
		System.out.println("Digite agora a altura do triângulo: ");
		altura = teclado.nextDouble();
		areaTotal = (base * altura) / 2;
		System.out.printf("A área total deste triângulo é: %.2f", areaTotal);
		teclado.close();
	}

}
