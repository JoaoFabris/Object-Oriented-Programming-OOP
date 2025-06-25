public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    private int diaAniversario;
    
    public ContaPoupanca(String numeroConta, String titular, double saldo, 
                        double taxaRendimento, int diaAniversario) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
    }
    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public int getDiaAniversario() {
        return diaAniversario;
    }
    
    public void calcularRendimento() {
        double rendimento = saldo * (taxaRendimento / 100);
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + String.format("%.2f", rendimento) + " aplicado!");
        System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
    }
    
    public void simularRendimento(int meses) {
        double saldoSimulado = saldo;
        for (int i = 1; i <= meses; i++) {
            saldoSimulado += saldoSimulado * (taxaRendimento / 100);
        }
        System.out.println("Simulação de " + meses + " meses:");
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        System.out.println("Saldo projetado: R$ " + String.format("%.2f", saldoSimulado));
        System.out.println("Rendimento total: R$ " + String.format("%.2f", (saldoSimulado - saldo)));
    }
    
    @Override
    public String toString() {
        return "CONTA POUPANÇA: " + super.toString() + 
               " - Rendimento: " + taxaRendimento + "% a.m." + 
               " - Aniversário: dia " + diaAniversario;
    }
}