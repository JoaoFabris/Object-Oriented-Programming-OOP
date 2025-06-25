public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoFreio;
    
    public Moto(String modelo, int ano, int cilindradas, String tipoFreio) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.tipoFreio = tipoFreio;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }
    
    public String getTipoFreio() {
        return tipoFreio;
    }
    
    public void empinar() {
        System.out.println("Moto " + modelo + " empinando!");
    }
    
    // Sobrescrita do método imprimirInformacoes
    @Override
    public void imprimirInformacoes() {
        System.out.println("=== INFORMAÇÕES DA MOTO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: Motocicleta");
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("Tipo de Freio: " + tipoFreio);
        System.out.println("Categoria: Veículo de Duas Rodas");
        
        // Classificação por cilindradas
        if (cilindradas <= 125) {
            System.out.println("Classificação: Moto de Baixa Cilindrada");
            System.out.println("Ideal para: Uso urbano e economia");
        } else if (cilindradas <= 300) {
            System.out.println("Classificação: Moto de Média Cilindrada");
            System.out.println("Ideal para: Uso misto (cidade/estrada)");
        } else if (cilindradas <= 600) {
            System.out.println("Classificação: Moto de Alta Cilindrada");
            System.out.println("Ideal para: Esporte e viagens");
        } else {
            System.out.println("Classificação: Moto Super Esportiva");
            System.out.println("Ideal para: Alta performance");
        }
        
        // Informações sobre o freio
        if (tipoFreio.equalsIgnoreCase("Disco")) {
            System.out.println("Vantagem: Melhor poder de frenagem");
        } else if (tipoFreio.equalsIgnoreCase("Tambor")) {
            System.out.println("Vantagem: Menor custo de manutenção");
        }
    }
    
    @Override
    public String toString() {
        return "Moto: " + super.toString() + " - " + cilindradas + "cc - " + tipoFreio;
    }
}