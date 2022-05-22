package CuentaCliente;

public class Cuenta implements Transferible {
	public int nroCta;
	public int saldo;

	public Cuenta(int cuentaNumero) {
		this.nroCta = cuentaNumero;
		this.saldo = 0;
	}
	
	public void depositar(int cant) {
		this.saldo = this.saldo + cant;
	}

	public void extraer(int cant) {
		this.saldo = this.saldo - cant;
	}

	public void mover(int cant, int nroCta) {
		// TODO Auto-generated method stub
		
	}

	public int getSaldo() {
		return saldo;
	}

}
