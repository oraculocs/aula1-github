import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		/*
		 * Programa que verifica se caso uma conta excedeu
		 * a cota de 100 minutos, caso exceda vai multiplicar
		 * a quantidade de minutos * 2.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da Conta = R$ %.2f%n", conta);
		

	}

}
