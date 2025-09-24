package exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		//System.out.println(dataAtual);
		//System.out.println(dataAtual.getDay());
		//System.out.println(dataAtual.getHours());
		
		Calendar hoje = Calendar.getInstance();
		System.out.println(hoje);
	//	System.out.println(Calendar.DAY_OF_MONTH);
		
		LocalDate dataDeHoje = LocalDate.now();
		//System.out.println(dataDeHoje);
		//System.out.println(dataDeHoje.of(2025, 6, 5));
		//System.out.println(dataDeHoje.isLeapYear());
		//System.out.println(dataDeHoje.plusDays(2));
		
		
		LocalTime hora = LocalTime.now();
		//System.out.println(hora);
		//System.out.println(hora.plusHours(2));
		
		LocalDateTime dataHora = LocalDateTime.now();
		//System.out.println(dataHora);
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
	}

}