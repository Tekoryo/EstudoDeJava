package entides;



public class ProdutoImportado extends Produto{
    
    private double TaxaAlfandegaria;

    public ProdutoImportado(){

    }
    public ProdutoImportado(String nome, double preco,double TaxaAlfandegaria){
        super(nome,preco);
        this.TaxaAlfandegaria=TaxaAlfandegaria;
    }

    public double getTaxaAlfandegaria(){
        return TaxaAlfandegaria;
    }
    public void setTaxaAlfandegaria(double TaxaAlfandegaria){
        this.TaxaAlfandegaria=TaxaAlfandegaria;
    }
    @Override
    public String TagDePreco(){
        double sum=preco+TaxaAlfandegaria;
        return String.valueOf(sum);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}