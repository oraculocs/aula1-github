import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String dia;
		
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;	
		case 7:
			dia = "S�bado";
			break;
			
		default:
			dia = "Valor Inv�lido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
				
		sc.close();

	}

}
