public class Mamifero extends Animal {
    private String tipoPelo;
    private int tempoGestacao;
    
    public Mamifero(String nome, String especie, int idade, double peso, 
                    String tipoPelo, int tempoGestacao) {
        super(nome, especie, idade, peso);
        this.tipoPelo = tipoPelo;
        this.tempoGestacao = tempoGestacao;
    }
    
    public String getTipoPelo() {
        return tipoPelo;
    }
    
    public int getTempoGestacao() {
        return tempoGestacao;
    }
    
    public void amamentar() {
        System.out.println(nome + " está amamentando seus filhotes");
    }
    
    public void regularTemperaturaCorporal() {
        System.out.println(nome + " está regulando a temperatura corporal");
    }
    
    @Override
    public void emitirSom() {
        if (especie.toLowerCase().contains("leão")) {
            System.out.println(nome + " ruge: ROAAAAR! ");
        } else if (especie.toLowerCase().contains("cachorro")) {
            System.out.println(nome + " late: AU AU AU! ");
        } else if (especie.toLowerCase().contains("gato")) {
            System.out.println(nome + " mia: MIAU MIAU! ");
        } else if (especie.toLowerCase().contains("vaca")) {
            System.out.println(nome + " muge: MUUUU! ");
        } else if (especie.toLowerCase().contains("cavalo")) {
            System.out.println(nome + " relincha: HIIIRRRR! ");
        } else if (especie.toLowerCase().contains("porco")) {
            System.out.println(nome + " grunhe: OINC OINC! ");
        } else if (especie.toLowerCase().contains("macaco")) {
            System.out.println(nome + " grita: UH UH AH AH! ");
        } else {
            System.out.println(nome + " (mamífero) emite sons característicos da espécie");
        }
    }
    
    @Override
    public String toString() {
        return "MAMÍFERO: " + super.toString() + " - Pelo: " + tipoPelo + 
               " - Gestação: " + tempoGestacao + " dias";
    }
}