public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;
    
    public Retangulo(String cor, double largura, double altura) {
        super("Retângulo", cor);
        this.largura = largura;
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
    
    public boolean ehQuadrado() {
        return largura == altura;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Largura: " + largura + " unidades");
        System.out.println("Altura: " + altura + " unidades");
        System.out.println("Diagonal: " + String.format("%.2f", calcularDiagonal()) + " unidades");
        System.out.println("É quadrado: " + (ehQuadrado() ? "Sim" : "Não"));
    }
}