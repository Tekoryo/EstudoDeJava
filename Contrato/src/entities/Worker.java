package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
		
	private String nome;
	private WorkerLevel level;
	private double BaseSalarial;
	
	private Departament departamento;
	private List<HourContract>Contract=new ArrayList<>();
	
	public Worker(String nome, WorkerLevel level, double baseSalarial, Departament departamento) {
		
		this.nome = nome;
		this.level = level;
		BaseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalarial() {
		return BaseSalarial;
	}

	public void setBaseSalarial(double baseSalarial) {
		BaseSalarial = baseSalarial;
	}

	public Departament getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departament departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContract() {
		return Contract;
	}
	
	public void addContract(HourContract contract) {
		Contract.add(contract);
	}
	public void rmContract(HourContract contract) {
		Contract.remove(contract);
	}
	public double income(int year, int morth) {
		double sum=BaseSalarial;
		Calendar cal= Calendar.getInstance();
		for(HourContract c: Contract) {
			cal.setTime(c.getData());
			int c_year=cal.get(Calendar.YEAR);
			int c_morth=1 + cal.get(Calendar.MONTH);
			if(year==c_year&&morth==c_morth) {
				sum+=c.TotalValore();
			}
		}
		return sum;
	}
}
