public class Triangulo extends FormaGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String cor, double lado1, double lado2, double lado3) {
        super("Triângulo", cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    @Override
    public double calcularArea() {
        // Usando a fórmula de Heron
        double s = calcularPerimetro() / 2; // semi-perímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public boolean ehValido() {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }
    
    public String tipoTriangulo() {
        if (!ehValido()) {
            return "Inválido";
        }
        
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Lado 1: " + lado1 + " unidades");
        System.out.println("Lado 2: " + lado2 + " unidades");
        System.out.println("Lado 3: " + lado3 + " unidades");
        System.out.println("Tipo: " + tipoTriangulo());
        System.out.println("Válido: " + (ehValido() ? "Sim" : "Não"));
    }
}