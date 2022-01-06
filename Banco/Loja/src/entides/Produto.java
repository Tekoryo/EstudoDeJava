package entides;


public class Produto{

    protected String nome;
    protected double preco;

    public Produto(){

    }
    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public String getNome(){
        return nome;
    }
    public double getpreco(){
        return preco;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setpreco(double preco){
        this.preco=preco;
    }

    public String TagDePreco(){
        return String.valueOf(preco);
    }
    public String toString(){
        return nome+" - R$"+TagDePreco();
    }

}