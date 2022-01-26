package programa;

import java.util.Scanner;

import entities.Loja;
import entities.Produto;

public class App {
    static Scanner Sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Loja(); 
        
        Sc.close();
    }
    public static void Loja(){
        Loja loja = CadastroDeLoja();
        loja.cadastroDeProdutos();
        loja.VerificandoID();
        loja.ViewProduto();
    } 
    public static entities.Loja CadastroDeLoja(){
        System.out.println("===== Loja =====");
        System.out.print("Nome da Loja: ");
        String Nome=Sc.nextLine();
        
        return new Loja(Nome);

    }
}
