package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    private String Nome;
    
    private Scanner Sc=new Scanner(System.in);
    private List<Produto>produtos=new ArrayList<>();

    public Loja(String nome) {
        this.Nome = nome;
       
    }
    public String getNome() {
        return Nome;
    }
    public void MudandoNomeLoja(String Nome){
        this.Nome=Nome;
    }

    public void cadastroDeProdutos(){
        System.out.print("Quantos Produtos ira cadastrar: ");
        int Numero=Sc.nextInt();
        for(int x=1;x<=Numero;x++){
                System.out.print("ID: ");
            int ID=Sc.nextInt();
            while(hasID(ID)){
                System.out.print("Digíte um Id valido: ");
                ID=Sc.nextInt();
            }
            System.out.print("Nome do Produto: ");
            String NomeProduto=Sc.next();
    
            System.out.print("Quantidade: ");
            int Quantidade=Sc.nextInt();
    
            System.out.print("Valor: ");
            double Preco=Sc.nextInt();

            Produto produto=new Produto(ID,NomeProduto,Quantidade,Preco);
            produtos.add(produto);
        }
    }    
    public void VerificandoID(){
        int x;
        do{
            System.out.print("ID do item a ser buscado: ");
            int Buscar=Sc.nextInt();
            ApliacandoDesconto(Buscar);
            System.out.print("valor do x: ");
            x=Sc.nextInt();
       }while(x==1);
    }
    public void ApliacandoDesconto(int Buscar){
        Produto produto=produtos.stream().filter(x -> x.getID()==Buscar).findFirst().orElse(null); 
        if(produto!=null){
            System.out.print("Qual é a procentagem do Desconto: ");
			double porcentagem=Sc.nextDouble();
			produto.Desconto(porcentagem);
        }      
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public boolean hasID(int ID){
        Produto produto=produtos.stream().filter(x ->x.getID()==ID).findFirst().orElse(null);
        return produto !=null;
    } 
    public void ViewProduto(){
        for(Produto x: produtos){
            System.out.println(x.toString());
        }
    }
}
