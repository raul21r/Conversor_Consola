
import java.util.*;

public class ConversorApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int input = 0; 
		
		while (input != 11) {
			Conversor.mostrarMenu();
			input = entrada.nextInt();
			
			switch(input) {
			case 1:
				Conversor.conversion("MX","Dolar",0.060,entrada);
				break;
			case 2:
				Conversor.conversion("MX","Euro",0.053,entrada);
				break;
			case 3:
				Conversor.conversion("MX","Libra",0.046,entrada);
				break;
			case 4:
				Conversor.conversion("MX","Yen",8.35,entrada);
				break;
			case 5:
				Conversor.conversion("MX","Won",75.71,entrada);
				break;
			case 6:
				Conversor.conversion("Dolar","MX",16.74,entrada);
				break;
			case 7:
				Conversor.conversion("Euro","MX",18.77,entrada);
				break;
			case 8:
				Conversor.conversion("Libra","MX",21.60,entrada);
				break;
			case 9:
				Conversor.conversion("Yen","MX",0.12,entrada);
				break;
			case 10:
				Conversor.conversion("Won","MX",0.013,entrada);
				break;
			case 11:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("¡Elija una opción valida!");
				break;
			}
			System.out.println();
		}
		entrada.close();
	}
}
