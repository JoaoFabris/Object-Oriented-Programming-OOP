public abstract class ContaBancaria {
    protected String numeroConta;
    protected String nomeTitular;
    protected double saldo;
    
    public ContaBancaria(String numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return false;
        }
    }
    
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void aplicarJuros();
    
    @Override
    public String toString() {
        return "Conta: " + numeroConta + " - Titular: " + nomeTitular + 
               " - Saldo: R$ " + String.format("%.2f", saldo);
    }
}