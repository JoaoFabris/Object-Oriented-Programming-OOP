public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(String cor, double raio) {
        super("Círculo", cor);
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public double calcularDiametro() {
        return 2 * raio;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Raio: " + raio + " unidades");
        System.out.println("Diâmetro: " + String.format("%.2f", calcularDiametro()) + " unidades");
    }
}