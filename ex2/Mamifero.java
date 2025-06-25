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
    public String toString() {
        return "MAMÍFERO: " + super.toString() + " - Pelo: " + tipoPelo +
                " - Gestação: " + tempoGestacao + " dias";
    }
}