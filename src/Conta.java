
public abstract class Conta {
	protected double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void atualiza (double taxa); //{
		//this.saldo+=(this.saldo*taxa);
	//}

	public Boolean saca (double valor) {
		if (saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			throw new RuntimeException("Saldo insuficiente");
		}
		
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
