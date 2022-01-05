package agenda;

import java.util.Locale;
import java.util.Scanner;

import pessoa.pessoa;

public class Agenda {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner Sc=new Scanner(System.in);
		String Email;
		String Nome;
		int Idade;
		System.out.print(" Dígite o numero de pessoa que vai ter: ");
		int n=Sc.nextInt();
		pessoa[] p=new pessoa[n];
		for(int i=0;i<n;i++) {
			if(i<n) {
				System.out.println("\n ===== Pessoa "+(i+1)+" =====");
			}
			System.out.print(" Dígite o nome: ");
			Nome=Sc.next();
			
			System.out.print("\n Terá E-mail?[S/n] ");
			char Resposta=Sc.next().charAt(0);
			if(Resposta=='S'||Resposta=='s') {
				System.out.print("\n Dígite o Email: ");
				Email=Sc.next();
			}else {
				Email=" Não foi informado";
			}
			
			System.out.print("\n Dígite a idade: ");
			Idade=Sc.nextInt();
			p[i]=new pessoa(Nome,Email,Idade);
		
		}
		for(int i=0;i<n;i++) {
			if(i<n) {
				System.out.println("\n ===== Pessoa "+(i+1)+"=====");
			}
			String res=p[i].toString();
			System.out.print(res);
			
			
		
		}
		
		Sc.close();
	}

}
