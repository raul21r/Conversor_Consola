import java.util.*;


public class Conversor {

	public static void mostrarMenu() {
		System.out.println("====================================");
		System.out.println("Bienvenido al conversor ONE");
		System.out.println("Seleccione una opción valida:");
		System.out.println("1 - PesoMX a Dolar");
		System.out.println("2 - PesoMX a Euros");
		System.out.println("3 - PesoMX a Libras");
		System.out.println("4 - PesoMX a Yen");
		System.out.println("5 - PesoMX a Won Sul");
		System.out.println("====================================");
		System.out.println("6 - Dólar a PesoMX");
		System.out.println("7 - Euros a PesoMX");
		System.out.println("8 - Libras a PesoMX");
		System.out.println("9 - Yen Japones a PesoMX");
		System.out.println("10 - Won Sul Corea a PesoMX");
		System.out.println("11 - Salir");
		System.out.println("====================================");
	}
	
	public static void conversion(String unidOrigen, String unidDestino, double proporcion, Scanner lector) {
		System.out.println("Elegiste la opción: " + unidOrigen + "-->>" + unidDestino);
		System.out.println("Ingrse el valor a convertir:");
		double valor = lector.nextDouble();
		double valorFinal = valor * proporcion;
		System.out.println("El resultado es: " + valorFinal);
	}
}
