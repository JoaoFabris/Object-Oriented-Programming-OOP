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
    public void emitirSom() {
        if (especie.toLowerCase().contains("golfinho")) {
            System.out.println(nome + " emite cliques: CLICK CLICK WHISTLE! ");
        } else if (especie.toLowerCase().contains("baleia")) {
            System.out.println(nome + " canta: WHOOOOO WHOOOOO! ");
        } else if (especie.toLowerCase().contains("tubarão")) {
            System.out.println(nome + " não emite sons audíveis... mas suas mandíbulas fazem SNAP! ");
        } else if (especie.toLowerCase().contains("peixe-palhaço")) {
            System.out.println(nome + " faz bolhas: BLUB BLUB BLUB! ");
        } else {
            System.out.println(nome + " faz bolhas na água: blub blub... ");
        }
    }
    
    @Override
    public String toString() {
        return "PEIXE: " + super.toString() + " - Água: " + tipoAgua + 
               " - Prof. máx: " + profundidadeMaxima + "m";
    }
}