import java.util.Scanner;

public class CalculaSalarioLiquido {

	public static void main(String[] args) {
		double salarioLiquido, horaTrabalhada, valorHora, descontoInss, salarioParcial, descontoInssInformado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo � calculadora de sal�rio l�quido.\nPara calcular seu sal�rio, preciso de algumas informa��es:\nPrimeiro, qual o valor da hora trabalhada? Por exemplo: R$ 50,00 por hora;");
		valorHora = teclado.nextDouble();
		System.out.println("Agora, preciso saber o n�mero de horas trabalhadas: por exemplo: 30;");
		horaTrabalhada = teclado.nextDouble();
		System.out.println("Agora, preciso de saber quantos por cento voc� paga de INSS: por exemplo: 0,10% se for 10% de desconto. OBS: digite sem o sinal de % (por cento).");
		descontoInssInformado = teclado.nextDouble();
		salarioParcial = valorHora * horaTrabalhada;
		descontoInss = salarioParcial / descontoInssInformado;
		descontoInss = descontoInss  / 100;
		salarioLiquido = salarioParcial - descontoInss;
		System.out.printf("Considerando que voc� trabalhou %.0f horas este mez, com o custo da hora sendo de %.2f por hora, seu sal�rio l�quido ser� de R$ %.2f", horaTrabalhada, valorHora, salarioLiquido);
		teclado.close();

	}

}
