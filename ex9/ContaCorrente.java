public class ContaCorrente extends ContaBancaria {
    private double limite;
    private double taxaManutencao;
    private int taloesEmitidos;
    
    public ContaCorrente(String numeroConta, String nomeTitular, double saldoInicial, 
                        double limite, double taxaManutencao) {
        super(numeroConta, nomeTitular, saldoInicial);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
        this.taloesEmitidos = 0;
    }
    
    public double getLimite() {
        return limite;
    }
    
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    
    public int getTaloesEmitidos() {
        return taloesEmitidos;
    }
    
    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = saldo + limite;
        
        if (valor > 0 && valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado!");
            
            if (saldo < 0) {
                System.out.println("ATENÇÃO: Você está usando o limite especial!");
                System.out.println("Valor usado do limite: R$ " + String.format("%.2f", Math.abs(saldo)));
            }
            return true;
        } else {
            System.out.println("Valor excede o saldo + limite disponível!");
            return false;
        }
    }
    
    public void emitirTalao() {
        taloesEmitidos++;
        System.out.println("Talão de cheques #" + taloesEmitidos + " emitido para " + nomeTitular);
    }
    
    public void cobrarTaxaManutencao() {
        saldo -= taxaManutencao;
        System.out.println("Taxa de manutenção de R$ " + String.format("%.2f", taxaManutencao) + 
                          " cobrada da conta corrente");
    }
    
    // Implementação específica para conta corrente - juros sobre saldo negativo (empréstimo)
    @Override
    public void aplicarJuros() {
        double taxaJuros = 0.15; // 15% ao mês para saldo negativo
        
        if (saldo < 0) {
            double juros = Math.abs(saldo) * taxaJuros;
            saldo -= juros;
            System.out.println("=== APLICAÇÃO DE JUROS - CONTA CORRENTE ===");
            System.out.println("Conta: " + numeroConta + " - " + nomeTitular);
            System.out.println("Saldo negativo detectado (uso do limite especial)");
            System.out.println("Taxa de juros aplicada: " + (taxaJuros * 100) + "% ao mês");
            System.out.println("Valor dos juros: R$ " + String.format("%.2f", juros));
            System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
            System.out.println("ATENÇÃO: Regularize sua situação o quanto antes!");
        } else {
            System.out.println("=== CONTA CORRENTE - SEM JUROS ===");
            System.out.println("Conta: " + numeroConta + " - " + nomeTitular);
            System.out.println("Saldo positivo - Não há cobrança de juros");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        }
    }
    
    @Override
    public String toString() {
        String status = saldo >= 0 ? "Normal" : "Usando Limite";
        return "CONTA CORRENTE: " + super.toString() + 
               " - Limite: R$ " + String.format("%.2f", limite) + 
               " - Status: " + status;
    }
}