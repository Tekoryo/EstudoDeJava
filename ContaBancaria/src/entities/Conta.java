package entities;



public class Conta{

    private Integer Numero;
    private String Suporte;
    private double Saldo;
    private double LimiteDeRetirada;

    public Conta(){

    }
    public Conta(int Numero, String Suporte, double Saldo, double LimiteDeRetirada){
        this.Numero=Numero;
        this.Suporte=Suporte;
        this.Saldo=Saldo;
        this.LimiteDeRetirada=LimiteDeRetirada;
    }

    public int getNumero(){
        return Numero;
    }
    public String getSuporte(){
        return Suporte;
    }
    public double getSaldo(){
        return Saldo;
    }
    public double getLimiteDeRetirada(){
        return LimiteDeRetirada;
    }
    public void getSuporte(String Suporte){
        this.Suporte=Suporte;
    }

    public void AddDeposito(double Deposito){
        this.Saldo+=Deposito;
    }

    public void Retirada(double Retirada) throws DomanException{
        if(LimiteDeRetirada<Retirada){
            throw new DomanException("O valor excede o limite de saque");
        }
        if(Retirada>Saldo){
            throw new DomanException("Não há Saldo suficiente");
        }
        
            this.Saldo-=Retirada;
    }
}