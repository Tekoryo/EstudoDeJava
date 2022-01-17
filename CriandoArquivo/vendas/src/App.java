import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    
    
    public static void main(String[] args){
            LendoProduto();
        
        
        
    }
    public static void LendoProduto(){
        String Path="/var/tmp/Produtos.csv";
        try(BufferedReader br=new BufferedReader(new FileReader(Path))){
            String line=br.readLine();
            int x=0;
            while(line !=null){
                System.out.print(line+" "+x+ "\n");
                line=br.readLine();
                x++;
            }
        }catch(IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
