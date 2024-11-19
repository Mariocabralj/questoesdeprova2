import java.util.Date;

public class CalculadoraMulta {
    private double multaDiaria;
    private CalculadoraDias calculadoraDias;

    // Construtor que aceita qualquer tipo de CalculadoraDias (DiasCorridos ou DiasUteis)
    
    public CalculadoraMulta(double multa, CalculadoraDias calculadora) {
        this.multaDiaria = multa;
        this.calculadoraDias = calculadora;
    }

    // Método para calcular a multa com base nos dias calculados
    
    public double calcularMulta(Date inicio, Date fim) {
        int dias = calculadoraDias.calcularDias(inicio, fim);
        return multaDiaria * dias;
    }
}