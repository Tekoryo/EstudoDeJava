package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entides.Funcionario;
import entides.FuncionarioTercerizado;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Sc=new Scanner(System.in);
        List<Funcionario>list=new ArrayList<>();

        System.out.print("Quantos funcionarios? ");
        int NumeroDeFuncionario=Sc.nextInt();
        for(int i=0;i<NumeroDeFuncionario;i++){
            System.out.println("Funcionario #"+(i+1));
            System.out.print("Terceirizado (S/n)? ");
            char Terceirizado=Sc.next().charAt(0);
            System.out.print("Nome: ");
            String Nome=Sc.next();
            System.out.print("Horas: ");
            int Horas=Sc.nextInt();
            System.out.print("Valor Por horas: ");
            double ValorPorHora=Sc.nextDouble();

            if(Terceirizado=='s'||Terceirizado=='S'){
                System.out.print("Bônus adicional: ");
                double Bonus=Sc.nextDouble();
                list.add(new FuncionarioTercerizado(Nome,Horas,ValorPorHora,Bonus));
                System.out.println("");
            }else{
                list.add(new Funcionario(Nome,Horas,ValorPorHora));
                System.out.println("");
            }
        }
        System.out.println("Pagamento:");
        for(Funcionario F: list){
            System.out.println(F.toString());
        }

        Sc.close();
    }
}
