import javax.swing.JOptionPane;

public class Moedas {
	private double valor;
	
	public void getValor(String opcao) {
		switch (opcao) {
		case "Converter de Reais a Dólar":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de $ " + String.format("%.2f",this.valor * 0.19), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Reais a Euro":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de € " + String.format("%.2f",this.valor * 0.18), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Reais a Libras Esterlinas":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de £ " + String.format("%.2f",this.valor * 0.16), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Reais a Peso argentino":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de $ " + String.format("%.2f",this.valor * 32.12), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Reais a Peso Chileno":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de $ " + String.format("%.2f",this.valor * 157.33) + " CLP",
					"Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Dólar a Reais":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de R$ " + String.format("%.2f",this.valor * 5.28), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Euro a Reais":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de R$ " + String.format("%.2f",this.valor * 5.69), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Libras Esterlinas a Reais":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de R$ " + String.format("%.2f",this.valor * 6.43), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Peso argentino a  Reais":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de R$ " + String.format("%.2f",this.valor * 0.026), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Converter de Peso Chileno a Reais":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de R$ " + String.format("%.2f",this.valor * 0.0064), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
