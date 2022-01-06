package entides;

public class FuncionarioTercerizado extends Funcionario{
    private double Bonus;
    //bonus de 110%
    public FuncionarioTercerizado(){
        super();
    }
    public FuncionarioTercerizado(String nome, int HorasTrabalhadas, double ValorPorHora, double Bonus) {
        super(nome, HorasTrabalhadas, ValorPorHora);
        this.Bonus=Bonus;
    }

    public double getBonus(){
        return Bonus;
    }
    public void setBonus(double Bonus){
        this.Bonus=Bonus;
    }

    @Override
    public double Pagamento(){
       super.Pagamento();
       return this.HorasTrabalhadas*this.ValorPorHora+(Bonus*1.10);
        
    }

}