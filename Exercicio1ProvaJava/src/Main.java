public class Main {

	public static void main(String[] args) {
		CalculadoraIrpf calculadora = new CalculadoraIrpf();

        // Teste com base de cálculo de R$ 50.000,00
        double base = 50000.00;
        double irpf = calculadora.calcularIrpf(base);

        System.out.println("O IRPF para a base de cálculo de R$ " + base + " é: R$ " + String.format("%.3f", irpf));
    }
	}
