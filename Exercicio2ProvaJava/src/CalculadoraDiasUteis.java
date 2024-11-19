import java.util.Date;

// Subclasse que implementa o cálculo de dias úteis
public class CalculadoraDiasUteis extends CalculadoraDias {
    @Override
    public int calcularDias(Date inicio, Date fim) {
    	
        // Implementação específica para dias úteis
        // Simulação da lógica de dias úteis
    	
        return calcularDiasUteis(inicio, fim);
    }

    private int calcularDiasUteis(Date inicio, Date fim) {
        // Llógica de cálculo de dias úteis aqui
        
    	return 10;
    }
}