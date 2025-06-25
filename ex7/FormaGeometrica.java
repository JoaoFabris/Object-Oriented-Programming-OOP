public abstract class FormaGeometrica {
    protected String nome;
    protected String cor;
    
    public FormaGeometrica(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCor() {
        return cor;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public void exibirInformacoes() {
        System.out.println("=== " + nome.toUpperCase() + " ===");
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + String.format("%.2f", calcularArea()) + " unidades²");
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()) + " unidades");
    }
    
    @Override
    public String toString() {
        return nome + " (" + cor + ") - Área: " + String.format("%.2f", calcularArea());
    }
}