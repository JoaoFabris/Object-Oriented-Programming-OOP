public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    
    public Carro(String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void abrirPortaMalas() {
        System.out.println("Porta-malas do " + modelo + " aberto!");
    }
    
    @Override
    public void imprimirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CARRO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: Automóvel");
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Categoria: Veículo de Passeio");
        
        if (numeroPortas == 2) {
            System.out.println("Estilo: Esportivo/Cupê");
        } else if (numeroPortas == 4) {
            System.out.println("Estilo: Sedan/Hatch");
        }
        
        if (tipoCombustivel.equalsIgnoreCase("Flex")) {
            System.out.println("Vantagem: Pode usar Etanol ou Gasolina");
        } else if (tipoCombustivel.equalsIgnoreCase("Elétrico")) {
            System.out.println("Vantagem: Zero Emissão de Poluentes");
        }
    }
    
    @Override
    public String toString() {
        return "Carro: " + super.toString() + " - " + numeroPortas + " portas - " + tipoCombustivel;
    }
}