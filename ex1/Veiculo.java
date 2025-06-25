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
    
    @Override
    public String toString() {
        return modelo + " (" + ano + ")";
    }
}