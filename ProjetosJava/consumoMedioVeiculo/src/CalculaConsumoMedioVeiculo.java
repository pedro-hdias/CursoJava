import java.util.Scanner;

public class CalculaConsumoMedioVeiculo {
public static void main(String[] args) {
	double consumoMedio, tempo, velocidadeMedia, distancia;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Seja bem-vindo � calculadora de consumo m�dio.\nSe baseando que seu altom�vel consome 12 litros por quil�metro rodado, irei calcular quanto de combust�vel voc� gastou.\nMe diga mais ou menos foi sua velocidade.");
	velocidadeMedia = teclado.nextDouble();
	System.out.println("Agora me diga quanto tempo gastou, no formato minutos. Exemplo, 2 horas = 120 minutos;.");
	tempo = teclado.nextDouble();
	distancia = velocidadeMedia * tempo;
	consumoMedio =  distancia / 12;
	System.out.printf("O consumo m�dio foi: %.2f", consumoMedio);
	teclado.close();
}
}
