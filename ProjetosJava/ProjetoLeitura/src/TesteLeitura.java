import java.util.Scanner;

public class TesteLeitura {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		int a;
		System.out.println("SDigite um n�mero");
		a = teclado.nextInt();
		System.out.printf("Voc� digitou %d", a);
	}

}
