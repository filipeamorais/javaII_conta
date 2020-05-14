
public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		//super.atualiza(taxa * 2);
		this.saldo+=(this.saldo*taxa*2);
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
