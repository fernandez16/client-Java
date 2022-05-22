package CuentaCliente;

public class Cliente {
	private String legajo;
	private String nombre;
	private String apellido;
	private Object cuenta;
	
	public Cliente(String legajo, String nombre, String apellido, int cuentaNumero) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta = new Cuenta(cuentaNumero);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
}
