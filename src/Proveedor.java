import java.util.ArrayList;

public class Proveedor {

	private String nombre;
	private String direccionProveedor;
	private String email;
	private String numTel;
	public ArrayList<Proveedor> proveduri = new ArrayList<Proveedor>();

	public Proveedor(String nombre, String direccion, String email, String telefono) {
		this.nombre = nombre;
		this.direccionProveedor = direccion;
		this.email = email;
		this.numTel = telefono;
	}

	public String tostring() {
		return nombre + " " + direccionProveedor + " " + email + " " + numTel;

	}

}
