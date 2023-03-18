import javax.swing.JOptionPane;

public class Conversao {
	private String tipo;
	private String opcao;
	private double valor;

	Conversao() {
		// Setando o tipo de conversão
		this.tipo = setTipo();
		// Setando a conversão
		this.opcao = setOpcao();
		// Criando a Janela da inserção de valor + Teste
		setValor();
	}

	public String setTipo() {
		// Criando a Janela do tipo de conversão
		String[] opcoes_main = { "Conversor de Moeda", "Conversor de Temperatura" };
		String aux_tipo = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Seleção de itens",
				JOptionPane.PLAIN_MESSAGE, null, opcoes_main, "");
		testeNull(aux_tipo);
		return(aux_tipo);
	}

	private String setOpcao() {
		// Criando a janela de opções
		switch (this.tipo) {
		case "Conversor de Moeda":
			String[] opcoes_moeda = { "Converter de Reais a Dólar", "Converter de Reais a Euro",
					"Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso argentino",
					"Converter de Reais a Peso Chileno", "Converter de Dólar a Reais", "Converter de Euro a Reais",
					"Converter de Libras Esterlinas a Reais", "Converter de Peso argentino a  Reais",
					"Converter de Peso Chileno a Reais" };
			String aux_moeda = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Seleção de itens",
					JOptionPane.PLAIN_MESSAGE, null, opcoes_moeda, "");
			testeNull(aux_moeda);
			return aux_moeda;
		case "Conversor de Temperatura":
			String[] opcoesTemperatura = {"Celcius para Fahrenheit","Celsius para Kelvin","Fahrenheit para Celsius","Kelvin para Celsius","Fahrenheit para Kelvin","Kelvin para Fahrenheit"};
			String aux_temp = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Seleção de itens",
					JOptionPane.PLAIN_MESSAGE, null, opcoesTemperatura, "");
			testeNull(aux_temp);
			return aux_temp;
		}
		return "";
	}

	private void setValor() {
		while (true) {
			String teste = JOptionPane.showInputDialog("Insira um valor:");
			testeNull(teste);
			if (campoNumerico(teste)) {
				this.valor = Float.parseFloat(teste);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido, favor digite um válido", "Message",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void resultado() {
		switch (this.tipo) {
		case "Conversor de Moeda":
			Moedas moeda = new Moedas();
			moeda.setValor(this.valor);
			moeda.getValor(this.opcao);
			break;
		case "Conversor de Temperatura":
			Temperatura temp = new Temperatura();
			temp.setValor(this.valor);
			temp.getValor(this.opcao);
			break;
		}
	}

	private boolean campoNumerico(String campo) {
		return campo.matches("[0-9]+");
	}

	private void testeNull(String teste) {
		if (teste == null) {
			JOptionPane.showMessageDialog(null, "Você está saindo do programa...");
			System.exit(0);
		}

	}

}
