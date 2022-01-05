package table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import funcionario.Funcionario;

public class Tabela {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Digíte a quantidade:");
		int N=Sc.nextInt();
		List<Funcionario> list=new ArrayList<>();
		//Aqui gera os funcionarios;
		for(int i=0;i<N;i++) {
			if(i<N) {
				System.out.println(" \n===== Funcionario #"+(i+1)+" =====");
			}
			System.out.print("\n Dígite o nome do funcionario: ");
			String Nome=Sc.next();
			System.out.print(" Dígite o ID do funcionario: ");
			int ID=Sc.nextInt();
			while(hasId(list,ID)) {
				System.out.print(" Dígite o ID não utilizado do funcionario: ");
				ID=Sc.nextInt();
			}
			System.out.print(" Dígite o Salário do funcionario: ");
			double Salario=Sc.nextDouble();
			list.add(new Funcionario(Nome,ID,Salario));
		}
		
		//Aqui Modificar o Salario;
		System.out.print("\n ID do funcionario que deseja modificar: ");
		int Buscar=Sc.nextInt();
		Funcionario funcio = list.stream().filter(x -> x.getId() == Buscar).findFirst().orElse(null);
			if(funcio==null) {		
				
				System.out.println(" Este ID é invalido! Abortando busca");
			}else{
				System.out.print(" Quantos porcento você ira aumentar: ");
				double porcentagem=Sc.nextDouble();
				funcio.Salario(porcentagem);
			}	
		//Montra os funcionarios
			System.out.println("\n ===== Lista de funcionario =====");
		for(Funcionario fun:list) {
			System.out.println(fun);
			
		}
		Sc.close();
	}
	public static boolean hasId(List<Funcionario> list,int id) {
		Funcionario funcio = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcio !=null;
	}

}
