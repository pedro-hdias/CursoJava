import java.util.Scanner;

public class TesteLeitura {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		int a;
		System.out.println("SDigite um número");
		a = teclado.nextInt();
		System.out.printf("Você digitou %d", a);
	}

}
