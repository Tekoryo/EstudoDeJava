package administracao;

import java.util.Scanner;

import quartos.Quartos;

public class Adm {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Número de pessoa que ira se registrar:");
		int N=Sc.nextInt();
		Quartos[] P=new Quartos[10];
		for(int i=0;i<N;i++) {
			System.out.print("Nome:");
			String nome=Sc.next();
			System.out.print("E-mail:");
			String email=Sc.next();
			System.out.print("Quarto: ");
			int room=Sc.nextInt();
			while(P[room]!=null) {
				System.out.print("Dígite numero de quarto vazio Quarto: ");
				room=Sc.nextInt();
			}
			P[room]=new Quartos(nome,email,room);
		}
		for(int i=0;i<P.length;i++) {
			
			if(P[i]!=null) {
				String List = P[i].toString();
				System.out.println(List);
			}
			
		}
		Sc.close();
	}

}
