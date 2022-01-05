package funcionario;

public class Funcionario {
	private String nome;
	private int id;
	private double salario;
	
	public Funcionario(String nome, int id, double salario) {
		this.nome=nome;
		this.id=id;
		this.salario=salario;
	}
	public void Salario(double porcentagem) {
		salario=salario*(1+porcentagem/100);
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", id=" + id + ", salario=" + salario + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public double getSalario() {
		return salario;
	}
	
}
