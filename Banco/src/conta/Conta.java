package conta;

public class Conta {
	private String nome;
	private int conta;
	private double saldo;
	
	public Conta(String nome,int conta,double valor) {
		this.nome=nome;
		this.conta=conta;
		this.saldo=valor;
	}
	public void Depositar(double Deposito) {
		this.saldo+=Deposito;
	}
	public void Sacar(double Sacar) {
		this.saldo-=Sacar+5;
	}
	public String toString() {
		return "nome: "+nome+
				"\nConta: "+conta+
				"\nSaldo: R$"+String.format("%.2f",saldo);
	}
}
