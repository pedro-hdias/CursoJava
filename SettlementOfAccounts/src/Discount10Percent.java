
public class Discount10Percent {
	public void Discount10 (String employeeName, double wageValue) {
		System.out.printf("O funcion�rio %s recebe %.2f.\nEle ir� pagar 10 por cento no fim, o que ele receber� totaliza: %.2f.", employeeName, wageValue, wageValue - wageValue * 0.10);
	}
}
