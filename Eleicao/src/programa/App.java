package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner Sc=new Scanner(System.in);
    static Map<String,Integer> mapCadidatos=new LinkedHashMap<>();
    public static void main(String[] args) throws Exception {
        try{
            arquivo();
        }
        catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }finally{
            Sc.close();
        }
    }
    public static void arquivo(){
        String path;
        System.out.print("Deseja digitar o caminho [s/n]: ");
        char auto=Sc.next().charAt(0);
        if(auto=='s'||auto=='S'){
            System.out.print("Digite o caminho completo do arquivo:");
            path=Sc.next();
        }else{
            path="/var/tmp/ArquivosText/Cadidatos.csv";
        }
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String CandidatoCsv=br.readLine();
            while(CandidatoCsv!=null){
                String[] fildes=CandidatoCsv.split(",");
                String Nome=fildes[0];
                int Votos=Integer.parseInt(fildes[1]);
                if(mapCadidatos.containsKey(Nome)){
                    int somaVotos=mapCadidatos.get(Nome);
                    mapCadidatos.put(Nome,somaVotos+Votos); 
                }else{
                    mapCadidatos.put(Nome,Votos);
                }
                CandidatoCsv=br.readLine();
            }
            for(String key : mapCadidatos.keySet()){
                System.out.println(key + ": " + mapCadidatos.get(key));
            }
        }
        catch(IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
