import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		while (true) {			
			// Criação do meu objeto conversão
			Conversao resposta = new Conversao();
			resposta.resultado();

			int flag = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (flag == 1) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			} else if (flag == 2) {
				JOptionPane.showMessageDialog(null, "Programa concluído");
				break;
			}
		}

	}

}
