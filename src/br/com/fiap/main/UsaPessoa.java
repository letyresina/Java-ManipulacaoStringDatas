package br.com.fiap.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Pessoa;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p1;
		String aux, nome, dataNasc;
		LocalDate minhaData;
		
		try {
			aux = JOptionPane.showInputDialog("Digite seu nome");
			nome = aux.toUpperCase(); 
			
			aux = JOptionPane.showInputDialog("Digite sua data de nascimento");
			
			// arrumando a formatação em ano-mes-dia
			dataNasc = aux.substring(6,10);
			dataNasc += "-" + aux.substring(3,5);
			dataNasc += "-" + aux.substring(0,2);
			minhaData = LocalDate.parse(dataNasc);
			p1 = new Pessoa(nome, minhaData);
			
			JOptionPane.showMessageDialog(null, "Data formato EUA" 
					+ "\nData de nascimento: "  + p1.getDataNasc());
			
			// formatando em dia-mes-ano
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String dataFormatada = p1.getDataNasc().format(dft);
			
			JOptionPane.showMessageDialog(null, "Dados pessoais"
					+ "\nNome: " + p1.getNome()
					+ "\nData nascimento: " + dataFormatada
					+ "Idade: " + p1.calculaIdade() + " anos");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
