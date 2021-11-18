
public class Discount20Percent {
	public void Discount20(String enployeeName, double wageValue) {
		System.out.printf("O funcionário %s que recebe %.2f\nApós o disconto receberá: %.2f.", enployeeName, wageValue, wageValue - wageValue * 0.20);
	}
}
