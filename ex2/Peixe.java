public class Peixe extends Animal {
    private String tipoAgua;
    private int profundidadeMaxima;
    
    public Peixe(String nome, String especie, int idade, double peso, 
                 String tipoAgua, int profundidadeMaxima) {
        super(nome, especie, idade, peso);
        this.tipoAgua = tipoAgua;
        this.profundidadeMaxima = profundidadeMaxima;
    }
    
    public String getTipoAgua() {
        return tipoAgua;
    }
    
    public int getProfundidadeMaxima() {
        return profundidadeMaxima;
    }
    
    public void nadar() {
        System.out.println(nome + " está nadando em água " + tipoAgua);
    }
    
    public void respirarPelasGuelras() {
        System.out.println(nome + " está respirando pelas guelras");
    }
    
    @Override
    public String toString() {
        return "PEIXE: " + super.toString() + " - Água: " + tipoAgua + 
               " - Prof. máx: " + profundidadeMaxima + "m";
    }
}