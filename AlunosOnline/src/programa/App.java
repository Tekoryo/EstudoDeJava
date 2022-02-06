package programa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Alunos;

public class App {
    static Scanner Sc=new Scanner(System.in);
    static int Id;
    static Set<Alunos> CursoA=new HashSet<>();
    static Set<Alunos> CursoB=new HashSet<>();
    static Set<Alunos> CursoC=new HashSet<>();
    public static void main(String[] args) throws Exception {
        try{
            int x=0;
            CursoA(); 
            CursoB();
            CursoC();
            Set<Alunos> t=new HashSet<>(CursoA);
            t.addAll(CursoB);
            Set<Alunos> ts=new HashSet<>(t);
            ts.addAll(CursoC);
            for(Alunos v:ts){
                if(v.equals(v.getAluno())==false){
                    x++;
                }
            
            }
            System.out.println("Número de estudade: "+x);
        }
        catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        finally{
            Sc.close();
        }
    }
    public static void CursoA(){
        System.out.print("Quantos alunos tem no curso A: ");
        int Na=Sc.nextInt();
        for(int x=1;x<=Na;x++){
            System.out.print("Id do Aluno "+x+": ");
            Id =Sc.nextInt();
            CursoA.add(new Alunos(Id));
        }
    }
    public static void CursoB(){
        System.out.print("Quantos alunos tem no curso B: ");
        int Na=Sc.nextInt();
        for(int x=1;x<=Na;x++){
            System.out.print("Id do Aluno "+x+": ");
            Id =Sc.nextInt();
            CursoB.add(new Alunos(Id));
        }  
    }
    public static void CursoC(){
        System.out.print("Quantos alunos tem no curso C: ");
        int Na=Sc.nextInt();
        for(int x=1;x<=Na;x++){
            System.out.print("Id do Aluno "+x+": ");
            Id =Sc.nextInt();
            CursoC.add(new Alunos(Id));
        }
    }
}
