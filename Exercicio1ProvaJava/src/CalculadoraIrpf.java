// Classe responsável por calcular o IRPF
public class CalculadoraIrpf {

    private TabelaIrpf tabelaIrpf = new TabelaIrpf(); // Instância da TabelaIrpf

    // Método para calcular o IRPF com base na tabela de alíquotas e deduções
    public double calcularIrpf(double base) {
        double aliquota = tabelaIrpf.obterAliquota(base);
        double deducao = tabelaIrpf.obterDeducao(base);
        return base * aliquota - deducao;
    }
}
