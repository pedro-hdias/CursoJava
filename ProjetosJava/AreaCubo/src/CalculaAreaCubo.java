import java.util.Scanner;

public class CalculaAreaCubo {
	public static void main(String[] args) {
		int areaTotal, lado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo � calculadora de �rea de cubo.\nDigite o tamanho de um lado.");
		lado = teclado.nextInt();
		areaTotal = lado * lado * lado;
		System.out.println("A �rea deste cubo �: " + areaTotal);
	}

}
