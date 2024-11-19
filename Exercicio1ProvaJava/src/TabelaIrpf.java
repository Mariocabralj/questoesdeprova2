// Classe responsável por fornecer alíquota e dedução com base na tabela do IRPF
public class TabelaIrpf {

    // Método para obter a alíquota com base na base de cálculo
	
    public double obterAliquota(double base) {
        if (base <= 24511.92) {
            return 0.0;
        } else if (base <= 33319.80) {
            return 0.075;
        } else if (base <= 45012.60) {
            return 0.15;
        } else if (base <= 55976.16) {
            return 0.225;
        } else {
            return 0.275;
        }
    }

    // Método para obter a dedução com base na base de cálculo
    
    public double obterDeducao(double base) {
        if (base <= 24511.92) {
            return 0.0;
        } else if (base <= 33319.80) {
            return 1838.39;
        } else if (base <= 45012.60) {
            return 4382.38;
        } else if (base <= 55976.16) {
            return 7758.32;
        } else {
            return 10557.13;
        }
    }
}
