package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class FormataData {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
		
		// obtendo periodo de tempo entre as duas datas
		Period periodo = Period.between(fimDosTempos, dataAtual);
		String tempoBonus = "Desde o fim dos tempos se passaram:"
				+ "\n" + periodo.getYears() + " anos" 
				+ "\n" + periodo.getMonths() + " meses"
				+ "\n" + periodo.getDays() + " dias";
		JOptionPane.showMessageDialog(null, tempoBonus);
		
		// formatando a data em dia-mes-tempo
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dataFormatada = fimDosTempos.format(dft);
		JOptionPane.showMessageDialog(null, dataFormatada);
	}

}
