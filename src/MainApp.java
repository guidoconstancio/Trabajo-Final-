import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Atenas.Producto;
import Atenas.Stock;

public class MainApp {

	public static void main(String[] args) {
		HashMap<String, Integer> inventario = new HashMap<>();
		Stock stock = new Stock();
		ArrayList<Proveedor> prove = new ArrayList<Proveedor>();
		Producto prod = new Producto();
		Scanner scan = new Scanner(System.in);
		int option = 1;
		while (option != 4) {
			mensaje("1_Facturación");
			mensaje("2_Proveedores");
			mensaje("3_Stock");
			mensaje("4_Salir");
			option = scan.nextInt();

			switch (option) {
			case 1:
				int opcion = 1;

				while (opcion != 3) {
					mensaje("1_Ingresar producto");
					mensaje("2_Generar ticket");
					mensaje("3_Volver al menú anterior");
					opcion = scan.nextInt();
					if (opcion == 1) {
					prod.listaDeArticulos();
					prod.agregarProdu();
				}
				if (opcion == 2) {
					System.out.println(prod.getFactura());
					System.out.println(prod.getTotal());
				}
				if (opcion == 3) {
					System.out.println("Volviendo al menú anterior\n\n");
				}

			}
				break;


			case 2:
				opcion = 0;
				while (opcion != 3) {

					System.out.println("1_Agregar proveedor");
					System.out.println("2_Ver lista de proveedores");
					System.out.println("3_Volver al menú anterior");
					opcion = scan.nextInt();
					if (opcion == 1) {

						System.out.println("Ingrese nombre: ");
						String nombre = scan.next();
						System.out.println("Ingrese dirección");
						String direccion = scan.next();
						System.out.println("Ingrese teléfono");
						String telefono = scan.next();
						System.out.println("mail");
						String mail = scan.next();
						Proveedor provNuevo = new Proveedor(nombre, direccion, telefono, mail);
						prove.add(provNuevo);
					}
					if (opcion == 2) {
						for (Proveedor persona : prove) {
							System.out.println(persona.tostring());
						}
					}

				}
				break;
			case 3:
				opcion = 0;
				while (opcion != 3) {
					System.out.println("1_Ingresar producto");
					System.out.println("2_Ver stock");
					System.out.println("3_Volver al menú anterior");
					opcion = scan.nextInt();
					if (opcion == 1) {

						stock.solicitarNombreProducto();
						stock.solicitarCantidadProducto();
						String nombre = stock.getNombreProducto();
						int cantidad = stock.getCantidadProducto();
						inventario.put(nombre, cantidad);
					}
					if (opcion == 2) {
						System.out.println(inventario.toString());
					}
				}

				break;

			default:
				System.out.println("Programa finalizado");
				break;
			}
		}



		}



		public static void mensaje(String mensaje) {
			System.out.println(mensaje);

		}

}
