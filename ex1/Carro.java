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
    public String toString() {
        return "Carro: " + super.toString() + " - " + numeroPortas + " portas - " + tipoCombustivel;
    }
}