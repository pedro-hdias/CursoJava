import java.util.Scanner;

public class CalculaVendaLucrativa {

	public static void main(String[] args) {
		Scanner inputKeyboard = new Scanner(System.in);
		double sellPrice, sellPercent, sellValue;
		System.out.println("Calcula venda lucrativa;\nQual o pre�o do produto vendido?");
		sellPrice = inputKeyboard.nextDouble();
		if (sellPrice < 20) {
			sellPercent = 0.45;
			sellValue = sellPrice / sellPercent;
			System.out.printf("O valor do produto, com %.2f por cento de juros � de: %.2f", sellPercent, sellValue);
		} else {
			sellPercent = 0.30;
			sellValue = sellPrice / sellPercent;
			System.out.printf("O valor do produto com %.2f por cento de juro �: %.2f",sellPercent, sellValue);
		}
		inputKeyboard.close();
	}

}
