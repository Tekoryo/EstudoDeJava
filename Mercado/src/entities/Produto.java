package entities;

public class Produto {
    private String Nome;
    private Integer ID;
    private Integer Quantidade;
    private Double Valor;

    public Produto(){

    }

    public Produto(int ID,String nome, Integer quantidade, Double valor) {
        Nome = nome;
        Quantidade = quantidade;
        Valor = valor;
        this.ID=ID;
    }

    public Integer getID() {
        return ID;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Quantidade = quantidade;
    }

    public Double getValor() {
        return Valor;
    }
    
    public void Desconto(double porcentagem){
        this.Valor=this.getValor()-(this.getValor()*(porcentagem/100));
    }

    @Override
    public String toString() {
        return "Produto [ID=" + ID + ", Nome=" + Nome + ", Quantidade=" + Quantidade + ", Valor=" + Valor + "]";
    }  
    
    
}
