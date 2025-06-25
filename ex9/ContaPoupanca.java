public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    private int diaAniversario;
    private int rendimentosAplicados;
    
    public ContaPoupanca(String numeroConta, String nomeTitular, double saldoInicial, 
                        double taxaRendimento, int diaAniversario) {
        super(numeroConta, nomeTitular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
        this.rendimentosAplicados = 0;
    }
    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public int getDiaAniversario() {
        return diaAniversario;
    }
    
    public int getRendimentosAplicados() {
        return rendimentosAplicados;
    }
    
    public void calcularRendimento() {
        double rendimento = saldo * (taxaRendimento / 100);
        System.out.println("Rendimento calculado: R$ " + String.format("%.2f", rendimento));
        System.out.println("Rendimento será aplicado no dia " + diaAniversario);
    }
    
    public void simularRendimento(int meses) {
        double saldoSimulado = saldo;
        System.out.println("=== SIMULAÇÃO DE RENDIMENTO ===");
        System.out.println("Saldo inicial: R$ " + String.format("%.2f", saldoSimulado));
        
        for (int i = 1; i <= meses; i++) {
            double rendimento = saldoSimulado * (taxaRendimento / 100);
            saldoSimulado += rendimento;
            System.out.println("Mês " + i + ": R$ " + String.format("%.2f", saldoSimulado) + 
                             " (rendimento: R$ " + String.format("%.2f", rendimento) + ")");
        }
        
        double totalRendimento = saldoSimulado - saldo;
        System.out.println("Total de rendimento em " + meses + " meses: R$ " + 
                          String.format("%.2f", totalRendimento));
    }
    
    @Override
    public void aplicarJuros() {
        double taxaJuros = 0.065;
        double rendimento = saldo * taxaJuros;
        double saldoAnterior = saldo;
        
        saldo += rendimento;
        rendimentosAplicados++;
        
        System.out.println("=== APLICAÇÃO DE RENDIMENTO - POUPANÇA ===");
        System.out.println("Conta: " + numeroConta + " - " + nomeTitular);
        System.out.println("Dia do aniversário: " + diaAniversario);
        System.out.println("Taxa de rendimento: " + (taxaJuros * 100) + "% ao mês");
        System.out.println("Saldo anterior: R$ " + String.format("%.2f", saldoAnterior));
        System.out.println("Rendimento aplicado: R$ " + String.format("%.2f", rendimento));
        System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("Total de rendimentos aplicados: " + rendimentosAplicados);
        System.out.println("Parabéns! Sua poupança está crescendo!");
    }
    
    @Override
    public String toString() {
        return "CONTA POUPANÇA: " + super.toString() + 
               " - Taxa: " + taxaRendimento + "% - Aniversário: dia " + diaAniversario +
               " - Rendimentos aplicados: " + rendimentosAplicados;
    }
}