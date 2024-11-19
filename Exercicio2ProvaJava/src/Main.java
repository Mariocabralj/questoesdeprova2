import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso com dias úteis
    	
        CalculadoraDias calculadoraDiasUteis = new CalculadoraDiasUteis();
        CalculadoraMulta multaComDiasUteis = new CalculadoraMulta(50.0, calculadoraDiasUteis);
        System.out.println("Multa com dias úteis: " + multaComDiasUteis.calcularMulta(new Date(), new Date()));

        // Exemplo de uso com dias corridos
        
        CalculadoraDias calculadoraDiasCorridos = new CalculadoraDiasCorridos();
        CalculadoraMulta multaComDiasCorridos = new CalculadoraMulta(50.0, calculadoraDiasCorridos);
        System.out.println("Multa com dias corridos: " + multaComDiasCorridos.calcularMulta(new Date(), new Date()));
    }
}
