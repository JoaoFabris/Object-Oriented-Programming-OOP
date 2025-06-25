public class Ave extends Animal {
    private double envergaduraAsas;
    private String tipoVoo;
    
    public Ave(String nome, String especie, int idade, double peso, 
               double envergaduraAsas, String tipoVoo) {
        super(nome, especie, idade, peso);
        this.envergaduraAsas = envergaduraAsas;
        this.tipoVoo = tipoVoo;
    }
    
    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }
    
    public String getTipoVoo() {
        return tipoVoo;
    }
    
    public void voar() {
        System.out.println(nome + " está voando com estilo " + tipoVoo);
    }
    
    public void botarOvos() {
        System.out.println(nome + " botou ovos no ninho");
    }
    
    @Override
    public String toString() {
        return "AVE: " + super.toString() + " - Envergadura: " + envergaduraAsas + 
               "m - Voo: " + tipoVoo;
    }
}