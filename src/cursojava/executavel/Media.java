package cursojava.executavel;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {

		/* Entrada de dados */
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 do aluno");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 do aluno");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 do aluno");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4 do aluno");

		double nota1Valor = Double.parseDouble(nota1);
		double nota2Valor = Double.parseDouble(nota2);
		double nota3Valor = Double.parseDouble(nota3);
		double nota4Valor = Double.parseDouble(nota4);

		double media = (nota1Valor + nota2Valor + nota3Valor + nota4Valor) / 4.0;

		/* M�dia para aprova��o � 70 */

		if (media >= 50) {
			if (media >= 70) {

				JOptionPane.showMessageDialog(null, "Parab�ns voc� foi aprovado direto.");

			} else {
				JOptionPane.showMessageDialog(null, "O aluno est� de recupera��o.");
			}
		} else {

			JOptionPane.showMessageDialog(null, "O aluno est� reprovado direto.");
		}

		JOptionPane.showMessageDialog(null, "O nome do aluno(a) � " + nomeAluno + " e sua m�dia foi " + media);

	}

}
