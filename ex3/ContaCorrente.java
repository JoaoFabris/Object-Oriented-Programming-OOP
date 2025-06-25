public class ContaCorrente extends ContaBancaria {
    private double limite;
    private double taxaManutencao;
    
    public ContaCorrente(String numeroConta, String titular, double saldo, 
                        double limite, double taxaManutencao) {
        super(numeroConta, titular, saldo);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }
    
    public double getLimite() {
        return limite;
    }
    
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    
    @Override
    public boolean sacar(double valor) {
        double saldoDisponivel = saldo + limite;
        if (valor > 0 && valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            if (saldo < 0) {
                System.out.println("Utilizando limite. Saldo atual: R$ " + String.format("%.2f", saldo));
            }
            return true;
        } else {
            System.out.println("Valor excede limite disponível!");
            return false;
        }
    }
    
    public void cobrarTaxaManutencao() {
        saldo -= taxaManutencao;
        System.out.println("Taxa de manutenção de R$ " + taxaManutencao + " cobrada!");
    }
    
    public void emitirTalao() {
        System.out.println("Talão de cheques emitido para a conta " + numeroConta);
    }
    
    @Override
    public String toString() {
        return "CONTA CORRENTE: " + super.toString() + 
               " - Limite: R$ " + String.format("%.2f", limite) + 
               " - Taxa: R$ " + String.format("%.2f", taxaManutencao);
    }
}