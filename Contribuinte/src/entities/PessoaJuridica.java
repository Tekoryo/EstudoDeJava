package entities;

public class PessoaJuridica extends Contribuinte{
    private Integer NumeroDeFuncionario;
    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String Nome,double RendaAnual, int NumeroDeFuncionario){
        super(Nome,RendaAnual);
        this.NumeroDeFuncionario=NumeroDeFuncionario;
    }
    public int getNumeroDeFuncionario(){
        return NumeroDeFuncionario;
    }
    public void setNumeroDeFuncionario(int NumeroDeFuncionario){
        this.NumeroDeFuncionario=NumeroDeFuncionario;
    }
    @Override
    public double Imposto(){
        double ValorImposto;
        if(NumeroDeFuncionario>10){
            ValorImposto=this.RendaAnual*0.14;
        }else{
            ValorImposto=this.RendaAnual*0.16;
        }
        return ValorImposto;
    }
}