package programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import produtos.Produto;

public class App {
    static List<Produto> list=new ArrayList<>();
   
    public static void main(String[] args){
         try{
            LendoProduto(); 
            LevandoProdutos(CrindoFile());
            System.out.println("Tudo certo!");
         }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
         }finally{
             System.out.println("Encerrando a sesão!");
         }
    }
    
    public static void LendoProduto(){
        String Path="/var/tmp/Produtos.csv";
        try(BufferedReader br=new BufferedReader(new FileReader(Path))){
            String itemcsv=br.readLine();
            while(itemcsv !=null){
                String[] produtos=itemcsv.split(",");
                String nome=produtos[0];
                double preco=Double.parseDouble(produtos[1]);
                int quantidade=Integer.parseInt(produtos[2]);
                list.add(new Produto(nome,quantidade,preco));

                itemcsv=br.readLine();
            }
        }catch(IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
    public static String CrindoFile(){
        boolean sucesso = new File("/var/tmp" + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucesso);
        String arquivo = "/var/tmp/out/summary.csv";
        return arquivo;        
    }
    
    public static void LevandoProdutos(String arquivo){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Produto line : list) {
            bw.write(line.getnome()+", "+String.format("%.2f", line.Total()));
            bw.newLine();
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
