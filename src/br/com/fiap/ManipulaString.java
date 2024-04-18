package br.com.fiap;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		String frase = "O rato roeu a roupa do rei de roma";
		JOptionPane.showMessageDialog(null, frase);
		
		// exibindo a quantidade de caracteres
		int qtdChar = frase.length();
		JOptionPane.showMessageDialog(null, qtdChar);
		
		// exibindo tudo em maiusculo
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		
		// exibindo tudo em minusculo
		String minusculo = frase.toLowerCase();
		JOptionPane.showMessageDialog(null, minusculo);
		
		// extraindo a palavra roma e exibindo
		String palavra = frase.substring(30,34);
		JOptionPane.showMessageDialog(null, palavra);
		
		// substituindo palavras
		String frase2 = frase.replace("roupa", "parede");
		JOptionPane.showMessageDialog(null, frase2);
	}

}
