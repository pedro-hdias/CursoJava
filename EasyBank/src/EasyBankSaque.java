import java.util.Scanner;

public class EasyBankSaque {
public static void main(String[] args) {
	int saque, cedula100, cedula50, cedula20, cedula10, cedula5, cedula2, resto, saque100, saque50, saque20, saque10, saque5, saque2,saqueLiberado;
	Scanner teclado = new Scanner(System.in);
	cedula100 = 100;
	cedula50 = 50;
	cedula20 = 20;
	cedula10 = 10;
	cedula5 = 5;
	cedula2 = 2;
	System.out.println("Saques, maravilha $$!\nEste caixa possui as seguintes c�dulas e quantidades:\n c�dulas de 100: " + cedula100 + ";\nC�dulas de 50: " + cedula50 + ";\nC�dulas de 20: " + cedula20 + ";\nC�dulas de 10: " + cedula10 + ";\nC�dulas de 5: " + cedula5 + ";\ne s�dulas de 2: " + cedula2 + ";\nOBSERVA��O: TODOS OS VALORES S�O EM REAIS BRASILEIROS.\nInforme o valor a sacar.");
	saque = teclado.nextInt();
	saque100 = saque / cedula100;
	resto = saque % cedula100;
	saque50 = resto / cedula50;
	resto = resto % cedula50;
	saque20 = resto / cedula20;
	resto = resto % cedula20;
	saque10 = resto / cedula10;
	resto= resto % cedula10;
	saque5 = resto / cedula5;
	resto = resto % cedula5;
	saque2 = resto / cedula2;
	System.out.println("Voc� sacou:\n" + saque100 +"Notas de 100;\n" + saque50 + "notas de 50;\n" + saque20 + "notas de 20;\n" + saque10 + "notas de 10;\n" + saque5 + "notas de 5;\n" + saque2 + "notas de 2.");
}
}
