package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner Sc=new Scanner(System.in);
		SimpleDateFormat Sd=new SimpleDateFormat("DD/MM/yyyy");
		
		System.out.print("Entre com o departamento: ");
		String depatament=Sc.next();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome=Sc.next();
		System.out.print("Level: ");
		String lvl=Sc.next();
		System.out.print("Salario Base: ");
		double Salario_Base=Sc.nextDouble();
		Worker worker=new Worker(nome, WorkerLevel.valueOf(lvl), Salario_Base, new Departament(depatament));
		
		System.out.print("Quantos contrato o trabalhador tem: ");
		int n=Sc.nextInt();
		
		for(int i=1;i<n;i++) {
			
			System.out.print("Contrato #"+i+" Data (DD/MM/YYYY): ");
			Date dataDate=Sd.parse(Sc.next());
			System.out.print("Valor Por Hora: ");
			double VpH =Sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int Horas =Sc.nextInt();
			
			HourContract Hc=new HourContract(VpH, Horas, dataDate);	
			worker.addContract(Hc);
		}
		
		System.out.print("Entre com o mês que será calculado (MM/YYYY): ");
		String MeA=Sc.next();
		int MM =Integer.parseInt(MeA.substring(0, 2));
		int YYYY =Integer.parseInt(MeA.substring(3));	
		System.out.println("Nome: "+worker.getNome());
		System.out.println("Departamento: "+worker.getDepartamento());
		System.out.println("REnda do mês "+ MeA +": "+ String.format("%.2f",worker.income(MM,YYYY)));
		Sc.close();
	}

}
