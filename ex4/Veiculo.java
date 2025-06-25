public class Veiculo {
    protected String modelo;
    protected int ano;
    
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    // Método que será sobrescrito nas subclasses
    public void imprimirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO VEÍCULO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: Veículo Genérico");
    }
    
    @Override
    public String toString() {
        return modelo + " (" + ano + ")";
    }
}