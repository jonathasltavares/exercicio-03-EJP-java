import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Empregado emp1 = new Empregado(null, null, 0);
			String n1 = JOptionPane.showInputDialog("Nome do empregado(a): ");
			emp1.setNome(n1);
			String s1 = JOptionPane.showInputDialog("Digite o sobrenome: ");
			emp1.setSobrenome(s1);
			String sl1 = JOptionPane.showInputDialog("Digite o sal�rio mensal: ");
			emp1.setSalarioMensal(Double.parseDouble(sl1));
		Empregado emp2 = new Empregado(null, null, 0);
			String n2 = JOptionPane.showInputDialog("Nome do empregado(a): ");
			emp2.setNome(n2);
			String s2 = JOptionPane.showInputDialog("Digite o sobrenome: ");
			emp2.setSobrenome(s2);
			String sl2 = JOptionPane.showInputDialog("Digite o sal�rio mensal: ");
			emp2.setSalarioMensal(Double.parseDouble(sl2));
			
		String options[] = {"adicionar aumento de 10%", "cancel"};
			int resposta = JOptionPane.showOptionDialog(null,
					"\nNome completo primeiro empregado: "+emp1.getNome()+" "+emp1.getSobrenome()+
					"\nSal�rio mensal: R$"+emp1.getSalarioMensal()+"\nSal�rio anual: R$"+emp1.getSalarioAnual()+
					"\nNome completo segundo empregado: "+emp2.getNome()+" "+emp2.getSobrenome()+
					"\nSal�rio mensal: R$"+emp2.getSalarioMensal()+"\nSal�rio anual: R$"+emp2.getSalarioAnual(),
					"Informa��es", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, options, options[1]);
			if (resposta == 0 ) {
				JOptionPane.showMessageDialog(null,"\nNome completo primeiro empregado: "+emp1.getNome()+" "+emp1.getSobrenome()+
				"\nSal�rio mensal atualizado: R$"+emp1.getAumentoMensal()+"\nSal�rio anual atualizado: R$"+emp1.getAumentoAnual()+
				"\nNome completo segundo empregado: "+emp2.getNome()+" "+emp2.getSobrenome()+
				"\nSal�rio mensal atualizado: R$"+emp2.getAumentoMensal()+"\nSal�rio anual atualizado: R$"+emp2.getAumentoAnual() );
				System.exit(0);
			}if(resposta == 1) {
				System.exit(0);
			}
			
		
	}

}
