package pessoa;

public class pessoa {
	private String nome;
	private String email;
	private int idade;
	
	public pessoa() {
		
	}
	public pessoa(String nome,String email,int idade) {
		this.nome=nome;
		this.email=email;
		this.idade=idade;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public long getIdade() {
		return idade;
	}
	public String toString() {
		return "Nome: "+nome+
				"\nE-mail: "+email+
				"\nTelefone: "+idade;
	}
}
