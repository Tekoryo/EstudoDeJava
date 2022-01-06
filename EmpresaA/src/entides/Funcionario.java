package entides;

public class Funcionario {
    private String nome;
    protected Integer HorasTrabalhadas;
    protected double ValorPorHora;
    
    public Funcionario() {
    }
    public Funcionario(String nome,int HorasTrabalhadas,double ValorPorHora){
        this.nome=nome;
        this.HorasTrabalhadas=HorasTrabalhadas;
        this.ValorPorHora=ValorPorHora;
    }

    public String getNome(){
        return nome;
    }
    public Integer getHoraTrabalhadas(){
        return HorasTrabalhadas;
    }
     public double getValorPorHora(){
        return ValorPorHora;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setHoraTrabalhadas(Integer HorasTrabalhadas){
        this.HorasTrabalhadas=HorasTrabalhadas;
    }
     public void setValorPorHora(double ValorPorHora){
      this.ValorPorHora=ValorPorHora;
    }

    public double Pagamento(){
        return this.HorasTrabalhadas*this.ValorPorHora;
        
    }
    public String toString(){
        return nome+" - R$"+Pagamento();
    }

}
