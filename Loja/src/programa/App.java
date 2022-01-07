package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entides.Produto;
import entides.ProdutoImportado;
import entides.ProdutoUsado;

public class App {
    public static void main(String[] args) throws ParseException{
        Scanner Sc=new Scanner(System.in);
        SimpleDateFormat Sd=new SimpleDateFormat();
        List<Produto>list=new ArrayList<>();

        System.out.print("Quantos produtos vai ser? ");
        int NumearoDeProduto=Sc.nextInt();
        for(int i=0;i<NumearoDeProduto;i++){

            System.out.println("Produto #"+(i+1)+" Dados: ");

            System.out.print("Tipo do Produtos Comum, Importado ou Usado (C/I/U)? ");
            char TipoProduto=Sc.next().charAt(0);
            System.out.print("Nome do Produto: ");
            String Nome=Sc.next();
            System.out.print("Preço do Produto: ");
            double preco=Sc.nextDouble();

            if(TipoProduto=='i'||TipoProduto=='I'){
                System.out.print("Taxa de Importação: ");
                double Taxa=Sc.nextDouble();
                list.add(new ProdutoImportado(Nome,preco,Taxa));
            }else if(TipoProduto=='u'||TipoProduto=='U'){
                System.out.print("Data de fabricação: ");
                String Data=Sc.next();
                list.add(new ProdutoUsado(Nome,preco,Data));
            }else{
                list.add(new Produto(Nome,preco));
            }
        }
        for(Produto P:list){
            System.out.println(P.toString());
        }

        Sc.close();
    }
}
