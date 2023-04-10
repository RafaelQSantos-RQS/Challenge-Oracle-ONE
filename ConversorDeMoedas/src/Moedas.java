import javax.swing.JOptionPane;

public class Moedas {
    private double valor;
    private static final double REAIS_TO_DOLAR = 0.19;
    private static final double REAIS_TO_EURO = 0.18;
    private static final double REAIS_TO_LIBRAS = 0.16;
    private static final double REAIS_TO_ARGENTINO = 32.12;
    private static final double REAIS_TO_CHILENO = 157.33;
    private static final double DOLAR_TO_REAIS = 5.28;
    private static final double EURO_TO_REAIS = 5.69;
    private static final double LIBRAS_TO_REAIS = 6.43;
    private static final double ARGENTINO_TO_REAIS = 0.026;
    private static final double CHILENO_TO_REAIS = 0.0064;

    public void getValor(String opcao) {
        double resultado = 0.0;
        String moeda = "";
        switch (opcao) {
            case "Converter de Reais a Dólar":
                resultado = this.valor * REAIS_TO_DOLAR;
                moeda = "$";
                break;
            case "Converter de Reais a Euro":
                resultado = this.valor * REAIS_TO_EURO;
                moeda = "€";
                break;
            case "Converter de Reais a Libras Esterlinas":
                resultado = this.valor * REAIS_TO_LIBRAS;
                moeda = "£";
                break;
            case "Converter de Reais a Peso argentino":
                resultado = this.valor * REAIS_TO_ARGENTINO;
                moeda = "$";
                break;
            case "Converter de Reais a Peso Chileno":
                resultado = this.valor * REAIS_TO_CHILENO;
                moeda = "$";
                break;
            case "Converter de Dólar a Reais":
                resultado = this.valor * DOLAR_TO_REAIS;
                moeda = "R$";
                break;
            case "Converter de Euro a Reais":
                resultado = this.valor * EURO_TO_REAIS;
                moeda = "R$";
                break;
            case "Converter de Libras Esterlinas a Reais":
                resultado = this.valor * LIBRAS_TO_REAIS;
                moeda = "R$";
                break;
            case "Converter de Peso argentino a  Reais":
                resultado = this.valor * ARGENTINO_TO_REAIS;
                moeda = "R$";
                break;
            case "Converter de Peso Chileno a Reais":
                resultado = this.valor * CHILENO_TO_REAIS;
                moeda = "R$";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
        }
        JOptionPane.showMessageDialog(null, "O resultado da conversão é de " + moeda + " " + String.format("%.2f", resultado), "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
