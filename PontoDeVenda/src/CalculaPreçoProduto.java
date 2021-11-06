import java.util.Scanner;

public class CalculaPreçoProduto {
	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		double valueProduct, allPrice;
		allPrice = 0;
		System.out.println("Seja bem-vindo ao PDV, vou calcular o preço da sua compra.\nPara encerrar, digite -1.");
		do {
			System.out.println("Digite o valor: ");
			valueProduct = inputKeyboard.nextDouble();
			if (valueProduct > 0) {
				allPrice = allPrice + valueProduct;
			}
		} while (valueProduct > 0);
		System.out.printf("O preço final da sua compra foi: %.2f", allPrice);
		inputKeyboard.close();
	}
}
