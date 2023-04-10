import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        while (true) {
            // Criação do objeto Conversao e chamada do método resultado()
            Conversao conversao = new Conversao();
            conversao.resultado();

            // Exibe uma caixa de diálogo perguntando se o usuário deseja continuar
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

            // Encerra o programa se o usuário clicar em "Não"
            if (respostaUsuario == 1) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }
            // Encerra o programa se o usuário clicar em "Cancelar"
            else if (respostaUsuario == 2) {
                JOptionPane.showMessageDialog(null, "Programa concluído");
                break;
            }
        }

    }
}
