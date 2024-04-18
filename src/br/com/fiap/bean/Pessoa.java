package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

/* 
 * JavaBean ou bean é um objeto que
segue a especificação JavaBean. Para ser considerada como um JavaBean, uma
classe precisa seguir algumas convenções de nomenclatura de métodos,
construtores e comportamento. Consiste em ter construtor vazio e metodos gets e sets
 */


public class Pessoa {
	private String nome;
	private LocalDate dataNasc;
	
	public Pessoa() {}

	public Pessoa(String nome, LocalDate dataNasc) {
		this.nome = nome;
		setDataNasc(dataNasc);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		LocalDate dataInicio = LocalDate.parse("1899-12-31");
		LocalDate dataFim = LocalDate.now();
		try {
			if (dataNasc.isAfter(dataInicio) && dataNasc.isBefore(dataFim)) {
				this.dataNasc = dataNasc;
			}
			else {
				throw new Exception("Data fora da permitida.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); // encerrando programa pós erro
		}
	}
	
	public int calculaIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period idade = Period.between(dataNasc, dataAtual);
		return idade.getYears();
	}
}
