package datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Data {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate agora = LocalDate.now();
		
		System.out.println(agora.format(dtf));
		
		
		DayOfWeek diaDaSemana = LocalDate.of(2016, 03, 03).getDayOfWeek();
		System.out.println(diaDaSemana);
		
		LocalDate outraData = LocalDate.of(2099, 01, 25);
		System.out.println(outraData);
		
		Period periodo = Period.between(outraData, agora);
		
		System.out.println(periodo.getMonths());
		
	}

}
