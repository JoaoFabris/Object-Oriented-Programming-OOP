public class SistemaJurosBancarios {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente cc1 = new ContaCorrente("12345-6", "João Silva", 1000.0, 500.0, 15.0);
        ContaCorrente cc2 = new ContaCorrente("11111-1", "Maria Santos", -200.0, 1000.0, 20.0);
        
        ContaPoupanca cp1 = new ContaPoupanca("98765-4", "Pedro Costa", 2000.0, 6.5, 15);
        ContaPoupanca cp2 = new ContaPoupanca("55555-5", "Ana Lima", 5000.0, 6.5, 10);
        
        // Array de contas para demonstrar polimorfismo
        ContaBancaria[] contas = {cc1, cc2, cp1, cp2};
        
        System.out.println("=== SISTEMA DE APLICAÇÃO DE JUROS BANCÁRIOS ===");
        System.out.println("Banco Digital - Gestão Automatizada de Juros");
        System.out.println("=" .repeat(55));
        
        // Exibindo situação inicial das contas
        System.out.println("\n=== SITUAÇÃO INICIAL DAS CONTAS ===");
        for (int i = 0; i < contas.length; i++) {
            System.out.println((i + 1) + ". " + contas[i].toString());
        }
        
        // Simulando algumas operações antes da aplicação de juros
        System.out.println("\n=== OPERAÇÕES BANCÁRIAS ===");
        cc1.sacar(1200.0); // Vai usar o limite
        cc1.emitirTalao();
        
        cp1.depositar(500.0);
        cp2.simularRendimento(3);
        
        // Aplicando juros em todas as contas (polimorfismo)
        System.out.println("\n=== PROCESSAMENTO MENSAL DE JUROS ===");
        System.out.println("Aplicando juros/rendimentos em todas as contas...");
        System.out.println("=" .repeat(50));
        
        for (int i = 0; i < contas.length; i++) {
            System.out.println("\nProcessando conta " + (i + 1) + ":");
            contas[i].aplicarJuros(); // Polimorfismo em ação!
            System.out.println("-" .repeat(40));
        }
        
        // Situação final
        System.out.println("\n=== SITUAÇÃO FINAL DAS CONTAS ===");
        for (int i = 0; i < contas.length; i++) {
            System.out.println((i + 1) + ". " + contas[i].toString());
        }
        
        // Relatório de juros
        System.out.println("\n=== RELATÓRIO DE JUROS APLICADOS ===");
        double totalJurosCC = 0;
        double totalRendimentoCP = 0;
        int contasCorrente = 0;
        int contasPoupanca = 0;
        
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaCorrente) {
                contasCorrente++;
                ContaCorrente cc = (ContaCorrente) conta;
                if (cc.getSaldo() < 0) {
                    System.out.println("Conta Corrente " + cc.getNumeroConta() + 
                                     " - Juros cobrados (saldo negativo)");
                }
            } else if (conta instanceof ContaPoupanca) {
                contasPoupanca++;
                ContaPoupanca cp = (ContaPoupanca) conta;
                System.out.println("Conta Poupança " + cp.getNumeroConta() + 
                                 " - Rendimentos aplicados: " + cp.getRendimentosAplicados());
            }
        }
        
        System.out.println("\nResumo:");
        System.out.println("Contas Corrente processadas: " + contasCorrente);
        System.out.println("Contas Poupança processadas: " + contasPoupanca);
        System.out.println("Total de contas: " + contas.length);
        
        // Demonstração adicional
        System.out.println("\n=== DEMONSTRAÇÃO ADICIONAL ===");
        System.out.println("Aplicando juros novamente nas poupanças:");
        
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaPoupanca) {
                conta.aplicarJuros();
                System.out.println();
            }
        }
    }
}