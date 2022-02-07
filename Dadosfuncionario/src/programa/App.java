package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Funcionario;
import model.service.FilterFuncionario;

public class App {
    static Scanner Sc=new Scanner(System.in);
    static List<Funcionario>ListFuncionario=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        try{
            Arquivo();
            ViewArquivo();
        }
        catch(Exception e){
            System.out.println("ERRO: "+e.getMessage());
        }
        finally{
            Sc.close();
        }
    }

    public static void Arquivo(){
        String path;
        System.out.print("Deseja digitar o caminho [s/n]: ");
        char auto=Sc.next().charAt(0);
        if(auto=='s'||auto=='S'){
            System.out.print("Digite o caminho completo do arquivo:");
            path=Sc.next();
        }else{
            System.out.println("Modo Automatico");
            path="/var/tmp/ArquivosText/ListPessoa.csv";
        }
        LerArquivo(path);
    }

    public static void LerArquivo(String path){
        try(BufferedReader br=new BufferedReader(new FileReader(path))) {
            String ReaderList=br.readLine();
            while(ReaderList!=null){
                String[] fildes=ReaderList.split(",");
                ListFuncionario.add(new Funcionario(fildes[0], fildes[1], Double.parseDouble(fildes[2])));
                ReaderList=br.readLine();
            }

        } catch (Exception e) {
            System.out.println("ERRO: "+e.getMessage());
        }
    }

    public static void FilterListaFuncionario(){
        FilterFuncionario Ff=new FilterFuncionario();
        double soma=Ff.SteamFilter(ListFuncionario, p ->p.getNome().charAt(0)=='M');
        System.out.println("A soma Salarial das pessoas que começa com 'M' é: "+String.format("%.2f", soma));
    }
    
    public static void ViewArquivo(){
        System.out.print("Valor do Salario a ser analisado: ");
        double Salaria=Sc.nextDouble();
        System.out.println("==== Lista Funcionario ====");
        Comparator<String> comp=(s1,s2)-> s1.toUpperCase().compareTo(s2.toUpperCase());
        List<String> Email = ListFuncionario.stream()
					.filter(p -> p.getSalario() > Salaria)
					.map(p -> p.getEmail()).sorted()
					.collect(Collectors.toList());
        Email.forEach(System.out::println);
        FilterListaFuncionario();
    }
}
