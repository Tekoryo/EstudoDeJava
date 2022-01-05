package entities;

import java.text.ParseException;
import java.util.Date;

public class HourContract {
	private Date data;
	private double ValorPorHora;
	private Integer hora;
	
	public HourContract(double VPh,int Horas, Date date) throws ParseException {
		this.data=date;
		this.hora=Horas;
		this.ValorPorHora=VPh;

	}
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return ValorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		ValorPorHora = valorPorHora;
	}

	public int getHoras() {
		return hora;
	}

	public void setHoras(int horas) {
		this.hora = horas;
	}	
	
	public double TotalValore() {
		double Salario=this.hora*this.ValorPorHora;
		return Salario;
	}
}
