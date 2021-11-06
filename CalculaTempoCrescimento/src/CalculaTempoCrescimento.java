
public class CalculaTempoCrescimento {
	public static void main(String[] args) {
		double tall1, tall2, result1;
		tall1 = 1.10;
		tall2 = 1.50;
		result1 = 0;
		while (tall1 <= tall2) {
			tall1 = tall1 + 0.03;
			tall2 = tall2 + 0.02;
			result1 ++;
		}
		System.out.printf("Levou %.0f anos para o Zé alcançar a altura do chico.", result1);
	}
}
