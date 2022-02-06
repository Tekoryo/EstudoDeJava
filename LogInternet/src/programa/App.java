package programa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Log;

public class App {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner Sc=new Scanner(System.in);
        System.out.print("Digite o caminho completo do arquivo:");
        String path=Sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            int x=0;
            String LogCsv=br.readLine();
            Set<Log>setLog=new HashSet<>();
            while(LogCsv!=null){
                String[] fildes=LogCsv.split(" ");
                setLog.add(new Log(fildes[0],Date.from(Instant.parse(fildes[1]))));  
                LogCsv=br.readLine();
            }
            //Falta ver os nome repetidos
            for(Log l:setLog){
                if(l.equals(l.getNick())==false){
                    x++;
                }
            }
            System.out.print("Total users: " + x);
            
        }catch (IOException e) {
            System.out.print("Erro: "+e.getMessage());
        }finally{
            Sc.close();
        }
    }
}
