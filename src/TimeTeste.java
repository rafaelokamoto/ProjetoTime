import javax.swing.JOptionPane;

public class TimeTeste {

	public static void main(String[] args) {
		Time t1;
		int hora;
		int minuto;
		int segundo;
		String horaText;
		String minutoText;
		String segundoText;
		String opcao;
		int option;
		do {
			opcao = JOptionPane.showInputDialog("Conversor de horas: \nEscolha entre as opcoes abaixo (0,1, -1): \n[0] - Para hora universal\n[1] - Para hora padrao (AM/PM)\n[-1] - Sair");
			option = Integer.parseInt(opcao);
			if (option == -1) {
				break;
			}
			horaText = JOptionPane.showInputDialog("Digite o valor das horas:");
			minutoText = JOptionPane.showInputDialog("Digite o valor dos minutos:");
			segundoText = JOptionPane.showInputDialog("Digite valor dos segundos:");
			hora = Integer.parseInt(horaText);
			minuto = Integer.parseInt(minutoText);
			segundo = Integer.parseInt(segundoText);
			t1 = new Time(hora,minuto,segundo);
			if (option == 0) {
				JOptionPane.showMessageDialog(null, t1.exibirHoraUniversal());
			}
			else {
				if (option == 1) {
					JOptionPane.showMessageDialog(null, t1.exibirHoraPadrao());
				}
			}
		}
		while (option != -1);
	}
}
