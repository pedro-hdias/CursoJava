
public class Discount10Percent {
	public void Discount10 (String employeeName, double wageValue) {
		System.out.printf("O funcionário %s recebe %.2f.\nEle irá pagar 10 por cento no fim, o que ele receberá totaliza: %.2f.", employeeName, wageValue, wageValue - wageValue * 0.10);
	}
}
