package entides;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.script.SimpleScriptContext;

public class ProdutoUsado extends Produto{
    SimpleDateFormat Sd=new SimpleDateFormat();

    private Date DataDaFabricacao;

    public ProdutoUsado(){
        super();
    }
    public ProdutoUsado(String nome, double preco,String Data) throws ParseException{
        super(nome,preco);
        this.DataDaFabricacao=Sd.parse(Data);
    }

    public Date getDataDaFabricacao(){
        return DataDaFabricacao;
    }
    public void setDataDaFabricacao(Date DataDaFabricacao){
        this.DataDaFabricacao=DataDaFabricacao;
    }

    @Override
    public String TagDePreco(){
        return String.valueOf(preco);
    }

    public String toString(){
        return super.toString()+"(Usado) R$"+TagDePreco()+"(Fabricado em: "+Sd.format(getDataDaFabricacao())+")";
    }

}