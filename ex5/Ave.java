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
    public void emitirSom() {
        if (especie.toLowerCase().contains("águia")) {
            System.out.println(nome + " grita: KIIIIAA! ");
        } else if (especie.toLowerCase().contains("papagaio")) {
            System.out.println(nome + " fala: ALÔÔÔ! QUERO BISCOITO! ");
        } else if (especie.toLowerCase().contains("galinha")) {
            System.out.println(nome + " cacareja: CÓ CÓ CÓ RICÓÓÓ! ");
        } else if (especie.toLowerCase().contains("pato")) {
            System.out.println(nome + " grasna: QUACK QUACK! ");
        } else if (especie.toLowerCase().contains("coruja")) {
            System.out.println(nome + " pia: UHU UHU UHU! ");
        } else if (especie.toLowerCase().contains("canário")) {
            System.out.println(nome + " canta: FIU FIU FIU! ");
        } else if (especie.toLowerCase().contains("galo")) {
            System.out.println(nome + " canta: COCORICÓÓÓ! ");
        } else {
            System.out.println(nome + " (ave) canta melodiosamente");
        }
    }

    @Override
    public String toString() {
        return "AVE: " + super.toString() + " - Envergadura: " + envergaduraAsas +
                "m - Voo: " + tipoVoo;
    }
}