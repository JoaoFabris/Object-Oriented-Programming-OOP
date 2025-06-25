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
    
    @Override
    public String toString() {
        return "Moto: " + super.toString() + " - " + cilindradas + "cc - " + tipoFreio;
    }
}