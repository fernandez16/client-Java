package CuentaCliente;

public class Test {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("legajo", "Juan", "Perez", 1033);
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getApellido());
		
		
	}

}
