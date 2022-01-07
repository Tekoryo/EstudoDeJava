package entities;

public class PessoaFisica extends Contribuinte{
    private double FaturaDeSaude;
    public PessoaFisica(){
        super();
    }
    public PessoaFisica(String Nome,double RendaAnual, double FaturaDeSaude){
        super(Nome,RendaAnual);
        this.FaturaDeSaude=FaturaDeSaude;
    }

    public double getFatureDeSaude(){
        return FaturaDeSaude;
    }
    public void setFatureDeSaude(double FaturaDeSaude){
        this.FaturaDeSaude=FaturaDeSaude;
    }

    @Override
    public double Imposto(){
        double ValorImposto,RendaAnual=0,FaturaSaude=0;

        if(this.RendaAnual<20000){
            RendaAnual=this.RendaAnual*0.15;
        }else{
            RendaAnual=this.RendaAnual*0.25;
        }
        if(this.FaturaDeSaude>0){
            FaturaSaude=this.FaturaDeSaude*0.5;
        }
        ValorImposto=RendaAnual-FaturaSaude;
        return ValorImposto;
    }
}