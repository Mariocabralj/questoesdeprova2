import java.util.Date;

// Subclasse que implementa o cálculo de dias corridos

public class CalculadoraDiasCorridos extends CalculadoraDias {
    @Override
    public int calcularDias(Date inicio, Date fim) {
        // Implementação específica para dias corridos
    	
        return calcularDiasCorridos(inicio, fim);
    }

    private int calcularDiasCorridos(Date inicio, Date fim) {
        // Sua lógica de cálculo de dias corridos aqui
    	
        return 15; 
    }
}