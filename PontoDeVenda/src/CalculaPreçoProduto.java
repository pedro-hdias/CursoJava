import java.util.Scanner;

public class CalculaPre�oProduto {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		double valueProduct, allPrice;
		allPrice = 0;
		System.out.println("Seja bem-vindo ao PDV, vou calcular o pre�o da sua compra.\nPara encerrar, digite -1.");
		do {
			System.out.println("Digite o valor: ");
			valueProduct = inputKeyboard.nextDouble();
			if (valueProduct > 0) {
				allPrice = allPrice + valueProduct;
			}
		} while (valueProduct > 0);
		System.out.printf("O pre�o final da sua compra foi: %.2f", allPrice);
		inputKeyboard.close();
	}
}
