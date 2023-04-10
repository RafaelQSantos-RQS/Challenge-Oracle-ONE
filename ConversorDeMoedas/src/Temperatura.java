import javax.swing.JOptionPane;

public class Temperatura {
    // Atributo que armazena o valor da temperatura
    private double valor;
    
    private static final double FAHRENHEIT_FREEZING_POINT = 32.0;
    private static final double KELVIN_FREEZING_POINT = 273.15;
    // Construtor padrão da classe
    Temperatura() {}

    // Método que converte a temperatura e mostra o resultado na tela
    public void getValor(String opcao) {
        // Verifica se o valor da temperatura é válido
        if (!isValidValue()) {
            JOptionPane.showMessageDialog(null, "Valor inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Realiza a conversão de temperatura de acordo com a opção selecionada
        switch(opcao) {
            case "Celsius para Fahrenheit":
                showResultado(convertCelsiusToFahrenheit());
                break;
            case "Celsius para Kelvin":
                showResultado(convertCelsiusToKelvin());
                break;
            case "Fahrenheit para Celsius":
                showResultado(convertFahrenheitToCelsius());
                break;
            case "Kelvin para Celsius":
                showResultado(convertKelvinToCelsius());
                break;
            case "Fahrenheit para Kelvin":
                showResultado(convertFahrenheitToKelvin());
                break;
            case "Kelvin para Fahrenheit":
                showResultado(convertKelvinToFahrenheit());
                break;
            // Caso a opção selecionada não seja válida, exibe uma mensagem de erro
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método que define o valor da temperatura
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método que verifica se o valor da temperatura é válido
    private boolean isValidValue() {
        return !Double.isNaN(valor) && !Double.isInfinite(valor);
    }

    // Método que exibe o resultado da conversão na tela
    private void showResultado(double resultado) {
        JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + String.format("%.1f", resultado), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos que realizam as conversões de temperatura
    private double convertCelsiusToFahrenheit() {
        return 1.8 * valor + FAHRENHEIT_FREEZING_POINT;
    }

    private double convertCelsiusToKelvin() {
        return valor + KELVIN_FREEZING_POINT;
    }

    private double convertFahrenheitToCelsius() {
        return (valor - FAHRENHEIT_FREEZING_POINT) / 1.8;
    }

    private double convertKelvinToCelsius() {
        return valor - KELVIN_FREEZING_POINT;
    }

    private double convertFahrenheitToKelvin() {
		return ((valor - FAHRENHEIT_FREEZING_POINT) * 5) / 9 + KELVIN_FREEZING_POINT;
	}
	
	private double convertKelvinToFahrenheit() {
		return ((valor - KELVIN_FREEZING_POINT) * 9) / 5 + FAHRENHEIT_FREEZING_POINT;
	}
}	