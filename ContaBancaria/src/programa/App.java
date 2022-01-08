package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Conta;
import entities.DomanException;

public class App {
    public static void main(String[] args) throws DomanException {
       
        Scanner Sc=new Scanner(System.in);

        System.out.print("Número: ");
        int Numero=Sc.nextInt();
        System.out.print("Suporte: ");
        String Suporte=Sc.next();
        System.out.print("Saldo inicial: ");
        double Saldo=Sc.nextDouble();
        System.out.print("Limite de Retirada: ");
        double LimiteDeRetirada=Sc.nextDouble();

        Conta conta1 = new Conta(Numero, Suporte, Saldo, LimiteDeRetirada);

        try{
            System.out.print("Valor da retirada: ");
            double ValorRetirada=Sc.nextDouble();
            conta1.Retirada(ValorRetirada);
        }catch(DomanException e){
            System.out.print("Erro no sacar: "+ e.getMessage());
        }
        System.out.println("Valor do novo saldo: "+conta1.getSaldo());

    }
}
