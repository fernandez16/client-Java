package CuentaCliente;

public class CuentaCorriente extends Cuenta {

	public int ultimoNroCheque;

	public CuentaCorriente(int cuentaNumero) {
		super(cuentaNumero);
	}
	
	public int getUltimoNroCheque() {
		return ultimoNroCheque;
	}

}
