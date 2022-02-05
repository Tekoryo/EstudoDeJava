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
        //SimpleDateFormat Sdc=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //2018-08-26T20:45:08Z
        System.out.print("Digite o caminho completo do arquivo:");
        String path=Sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String LogCsv=br.readLine();
            Set<Log>setLog=new HashSet<>();
            int n=1;
            while(LogCsv!=null){
                String[] fildes=LogCsv.split(" ");
                setLog.add(new Log(fildes[0],Date.from(Instant.parse(fildes[1]))));  
                LogCsv=br.readLine();
                n++;
            }
            //Falta ver os nome repetidos
            System.out.println("==== View ====");
            for(Log l:setLog){
                System.out.println(l.toString());
            }
            
        }catch (IOException e) {
            System.out.print("Erro: "+e.getMessage());
        }finally{
            Sc.close();
        }
    }
}
