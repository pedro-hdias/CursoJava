import java.util.Scanner;
public class Luz {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Programa para calcular o valor de KWH gasto, em REAIS");
                System.out.println("Por favor, insira o valor do sal�rio m�nimo atual");
double salarioMinimo = teclado.nextDouble();
                System.out.println("Por favor, insira a quantidade de KWH gasta no �ltimo m�s.");
double quantidadeKWH = teclado.nextDouble();
double valorCadaKWH = (salarioMinimo*0.14)/100;
System.out.println("Resultados do valor de cada KWH:" + valorCadaKWH + "Reais");
double valorKWH = (salarioMinimo*0.14);
System.out.println("Quanto voc� vai pagar por m�s:" + valorKWH + "Reais");
double valorDescKWH = (salarioMinimo*0.14)*0.9;
System.out.println("Valor a pagar com desconto de 10%:" + valorDescKWH + "Reais");


}
}
