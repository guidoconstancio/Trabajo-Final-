package Atenas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Producto {




	protected double total;
	protected HashMap<String, Integer> articulos = new HashMap<String, Integer>();
	private static Scanner scan = new Scanner(System.in);
	ArrayList<String> factura = new ArrayList<String>();


	public void listaDeArticulos() {
		articulos.put("Empanada de carne", 200);
		articulos.put("Bocadillo", 480);
		articulos.put("Milanesa", 800);
		articulos.put("Riojana", 1400);
		articulos.put("Flan", 500);
		articulos.put("Brownie", 700);
	}
	
	public void agregarProdu() {
		String entradaUsuario;
		System.out.println("Ingrese producto: ");
		entradaUsuario = scan.next();
		if (articulos.containsKey(entradaUsuario)) {

			total += articulos.get(entradaUsuario);
			factura.add("Item: " + entradaUsuario + " $" + articulos.get(entradaUsuario) + "\n");
		}
		else {
			System.out.println("***********************************************");
			System.out.println("El articulo no se encuentra en la base de datos");
			System.out.println("***********************************************");
		}
	}


	public String getTotal() {
		return "Total: $" + total + "\n\n";
	}

	public ArrayList<String> getFactura() {
		return factura;
	}


}










	
	
	


