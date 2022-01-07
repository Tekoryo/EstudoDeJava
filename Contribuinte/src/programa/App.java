package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;

public class App {
    public static void main(String[] args){

        Scanner Sc=new Scanner(System.in);
        List<Contribuinte>list=new ArrayList<>();

        System.out.print("N Pessoa: ");
        int N=Sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.print("");
            System.out.print("PF Ou PJ (f/j): ");
            char TipoPessoa=Sc.next().charAt(0);
            System.out.print("Nome: ");
            String Nome=Sc.next();
            System.out.print("Renda Anual: ");
            double RendaAnual=Sc.nextDouble();

            if(TipoPessoa=='f'||TipoPessoa=='F'){
                System.out.print("Fatura de Saúde: ");
                double FaturaDeSaude=Sc.nextDouble();
                list.add(new PessoaFisica(Nome,RendaAnual,FaturaDeSaude));
            }else{
                System.out.print("Número  de fúcionario: ");
                int NumeroDeFuncionario=Sc.nextInt();
                list.add(new PessoaFisica(Nome,RendaAnual,NumeroDeFuncionario));
            }

        }

        System.out.println("");
        System.out.println("==== IMPOSTOS PAGOS ====");
        for(Contribuinte C:list){
            System.out.println(C.toString());
        }
        
        System.out.println("");
        double ValorTotal=0;
        for(Contribuinte C:list){
            ValorTotal+=C.Imposto();
        }
        System.out.println("TOTAL DE IMPOSTOS: R$ "+String.format("%.2f", ValorTotal));

        Sc.close();
    }
}
