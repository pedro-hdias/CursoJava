import java.util.Scanner;

public class CalculaAreaLosango {

	public static void main(String[] args) {
		double areaTotal, diagonalI, diagonalII;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo � calculadora de �rea de um lozango.\nMe diga o tamanho de uma diagonal: ");
		diagonalI = teclado.nextDouble();
		System.out.println("Agora da segunda diagonal: ");
		diagonalII = teclado.nextDouble();
		areaTotal = diagonalI * diagonalII;
		System.out.println("A �rea total deste lozango �: " + areaTotal);
	}

}
