package entities;

public abstract class Contribuinte{
    protected String Nome;   
    protected double RendaAnual;

    public Contribuinte(){

    }
    public Contribuinte(String Nome,double RendaAnual){
        this.Nome=Nome;
        this.RendaAnual=RendaAnual;
    }

    public String getNome(){
        return Nome;
    }
    public double getRendaAnual(){
        return RendaAnual;
    }
    public void getNome(String Nome){
        this.Nome=Nome;
    }

    public abstract double Imposto();

    @Override
    public String toString(){
        return getNome()+": R$ "+String.format("%.2f", Imposto());
    } 
}