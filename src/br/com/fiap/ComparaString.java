package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaString {

	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha");
		
		//diferencia maiuscula de minuscula
		if (senha.equals("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Acesso autorizado: Teste 1 Logado.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Acesso negado: Anomalia.");
		}

		// sem diferenciação de maiuscula e minuscula
		if (senha.equalsIgnoreCase("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Acesso autorizado: Teste 2 Logado.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Acesso negado: Anomalia.");
		}
	}

}
