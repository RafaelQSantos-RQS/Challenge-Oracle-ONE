import javax.swing.JOptionPane;

public class Temperatura {
	private double valor;
	
	Temperatura() {}
	
	public void getValor(String opcao) {
		switch(opcao) {
		case "Celcius para Fahrenheit":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f",1.8*this.valor + 32)+"F", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Celsius para Kelvin":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f",this.valor+273)+"K", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Fahrenheit para Celsius":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f",(this.valor-32)/1.8)+"ºC", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Kelvin para Celsius":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f",this.valor-273)+"ºC", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Fahrenheit para Kelvin":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f",((this.valor-32)*5)/9+273)+"K", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Kelvin para Fahrenheit":
			JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f",(((this.valor-273)*9)/5+32))+"K", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
