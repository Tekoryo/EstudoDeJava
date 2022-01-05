package programa;

import java.util.Scanner;

import conta.Conta;

public class Banco {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Qual é seu nome? ");
		String nome=sc.next();
		System.out.print("Número da conta: ");
		int conta=sc.nextInt();
		double valor;
		System.out.print("Você ira fazer um deposito inicial?[1/0] ");
		char resposta=sc.next().charAt(0);
		if(resposta==1) {
			System.out.print("Qual será o valor do deposito inicial? ");
			 valor = sc.nextDouble();
		}else {
			valor=0;
		}
		Conta P1=new Conta(nome,conta,valor);
		System.out.print(P1.toString());
		System.out.print("\nVocê quer fazer deposito:[1/0] ");
		resposta=sc.next().charAt(0);
		if(resposta==1) {
			System.out.print("Qual será o valor do deposito? ");
			valor = sc.nextDouble();
			P1.Depositar(valor);
			System.out.println(P1.toString());
		}
		System.out.print("\nVocê quer fazer Sacar:[1/0] ");
		resposta=sc.next().charAt(0);
		if(resposta==1) {
			System.out.print("\nQual será o valor do Saque? ");
			valor = sc.nextDouble();
			P1.Sacar(valor);
			System.out.println(P1.toString());
		}
		System.out.println("===== Final =====");
		System.out.print("Info da  P1:\n"+P1.toString());
		
	}

}
