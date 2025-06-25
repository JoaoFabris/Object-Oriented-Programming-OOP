public class TesteImpressaoVeiculos {
    public static void main(String[] args) {
        // Criando diferentes veículos
        Veiculo veiculo = new Veiculo("Genérico", 2020);
        Carro carro1 = new Carro("Civic", 2023, 4, "Flex");
        Carro carro2 = new Carro("Mustang", 2022, 2, "Gasolina");
        Moto moto1 = new Moto("CB 600F", 2022, 600, "Disco");
        Moto moto2 = new Moto("Pop 110i", 2023, 110, "Tambor");
        
        // Array de veículos para demonstrar polimorfismo
        Veiculo[] veiculos = {veiculo, carro1, carro2, moto1, moto2};
        
        System.out.println("SISTEMA DE IMPRESSÃO DE INFORMAÇÕES DE VEÍCULOS 🏍️");
        System.out.println("=" .repeat(60));
        
        // Imprimindo informações de cada veículo
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println("\n VEÍCULO " + (i + 1) + ":");
            veiculos[i].imprimirInformacoes(); // Polimorfismo em ação!
            System.out.println("-".repeat(50));
        }
        
        System.out.println("\n TESTANDO MÉTODOS ESPECÍFICOS:");
        System.out.println("=" .repeat(40));
        
        carro1.abrirPortaMalas();
        moto1.empinar();
        
        System.out.println("\n📊 RESUMO DOS VEÍCULOS:");
        System.out.println("=" .repeat(30));
        for (Veiculo v : veiculos) {
            System.out.println("• " + v.toString());
        }
    }
}