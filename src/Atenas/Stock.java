package Atenas;

import java.util.HashMap;
import java.util.Scanner;

public class Stock {
	HashMap<String, Integer> stock = new HashMap<>();
	public HashMap<String, Integer> inventario = new HashMap<>();
	public String getNombreProducto() {
		return nombreProducto;
	}

	Scanner scan = new Scanner(System.in);
	private String nombreProducto;
	private int cantidadProducto;

	public void solicitarNombreProducto() {

		System.out.println("Ingrese el nombre del producto: ");
		nombreProducto = scan.next();
}

	public void solicitarCantidadProducto() {
		System.out.println("Ingrese la cantidad de " + nombreProducto + " que desea ingresar: ");
		cantidadProducto = scan.nextInt();

	}

	public String getNombre() {
		return nombreProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public String verRegistro() {
		return "Producto:  " + nombreProducto + "Cantidad: " + cantidadProducto + "\n";

	}

}