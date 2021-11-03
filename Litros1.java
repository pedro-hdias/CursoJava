import java.util.Scanner;
public class Litros1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double VelocidadeMedia, TempoGasto, Autonomia = 12; 
		double Distancia, LitrosUsados;		
		System.out.print("Programa para calcular a quantidade de litros de combustível gasto em uma viagem"); 
		System.out.print("Por favor, digite o tempo que você gastou em sua viagem em horas: ");
		TempoGasto = teclado.nextDouble();
		System.out.print("Por favor, agora digite aVelocidade Média em que você realizou o percurso em Km/h: ");
		VelocidadeMedia = teclado.nextDouble();
 
		Distancia = VelocidadeMedia * TempoGasto;
		LitrosUsados = Distancia / Autonomia;
		System.out.print("Resultados:");
		System.out.print("Velocidade média = "+ VelocidadeMedia+ " Km/h");
		System.out.print("Tempo gasto = " + TempoGasto + " horas");
		System.out.print("Distancia Percorrida = " + Distancia + " Km ");
		System.out.printf("quantidade de litros usadas: %.2f litros", LitrosUsados);
		}
}