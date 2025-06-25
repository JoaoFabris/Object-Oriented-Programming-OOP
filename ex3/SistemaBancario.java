public class SistemaBancario {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente cc = new ContaCorrente("12345-6", "João Silva", 1000.0, 500.0, 15.0);
        ContaPoupanca cp = new ContaPoupanca("98765-4", "Maria Santos", 2000.0, 0.5, 15);

        System.out.println("=== CONTAS CADASTRADAS ===");
        System.out.println(cc);
        System.out.println(cp);
        System.out.println();

        System.out.println("=== OPERAÇÕES CONTA CORRENTE ===");
        cc.depositar(200.0);
        cc.sacar(800.0);
        cc.sacar(1000.0); // Vai usar o limite
        cc.emitirTalao();
        cc.cobrarTaxaManutencao();
        System.out.println("Saldo final CC: R$ " + String.format("%.2f", cc.getSaldo()));
        System.out.println();

        System.out.println("=== OPERAÇÕES CONTA POUPANÇA ===");
        cp.depositar(500.0);
        cp.calcularRendimento();
        cp.simularRendimento(6);
        cp.sacar(300.0);
        System.out.println("Saldo final CP: R$ " + String.format("%.2f", cp.getSaldo()));
        System.out.println();

        System.out.println("=== RESUMO FINAL ===");
        System.out.println(cc);
        System.out.println(cp);
    }
}