package CuentaCliente;

public interface Transferible {

	public void depositar(int cant);

	public void extraer(int cant);

	public void mover(int cant, int nroCta);
	
}
