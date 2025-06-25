public class CalculadoraGeometrica {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Circulo("Azul", 5.0),
            new Retangulo("Verde", 4.0, 6.0),
            new Retangulo("Amarelo", 5.0, 5.0), // Quadrado
            new Triangulo("Vermelho", 3.0, 4.0, 5.0), // Triângulo retângulo
            new Triangulo("Roxo", 5.0, 5.0, 5.0) // Triângulo equilátero
        };
        
        System.out.println("=== CALCULADORA GEOMÉTRICA PARA ENGENHEIROS ===");
        System.out.println("Ferramenta de cálculo de áreas e perímetros\n");
        
        for (int i = 0; i < formas.length; i++) {
            System.out.println("FORMA " + (i + 1) + ":");
            formas[i].exibirInformacoes();
            System.out.println();
        }
        
        System.out.println("=== RELATÓRIO RESUMIDO ===");
        double areaTotal = 0;
        double perimetroTotal = 0;
        
        for (FormaGeometrica forma : formas) {
            System.out.println(forma.toString());
            areaTotal += forma.calcularArea();
            perimetroTotal += forma.calcularPerimetro();
        }
        
        System.out.println("\n=== TOTAIS ===");
        System.out.println("Área total: " + String.format("%.2f", areaTotal) + " unidades²");
        System.out.println("Perímetro total: " + String.format("%.2f", perimetroTotal) + " unidades");
        
        FormaGeometrica maiorArea = formas[0];
        FormaGeometrica menorArea = formas[0];
        
        for (FormaGeometrica forma : formas) {
            if (forma.calcularArea() > maiorArea.calcularArea()) {
                maiorArea = forma;
            }
            if (forma.calcularArea() < menorArea.calcularArea()) {
                menorArea = forma;
            }
        }
        
        System.out.println("\n=== ANÁLISE ===");
        System.out.println("Maior área: " + maiorArea.getNome() + " (" + 
                          String.format("%.2f", maiorArea.calcularArea()) + " unidades²)");
        System.out.println("Menor área: " + menorArea.getNome() + " (" + 
                          String.format("%.2f", menorArea.calcularArea()) + " unidades²)");
        
        System.out.println("\n=== FUNCIONALIDADES ESPECÍFICAS ===");
        
        Circulo circulo = new Circulo("Branco", 3.0);
        System.out.println("Círculo - Diâmetro: " + String.format("%.2f", circulo.calcularDiametro()));
        
        Retangulo retangulo = new Retangulo("Preto", 4.0, 4.0);
        System.out.println("Retângulo - É quadrado: " + retangulo.ehQuadrado());
        
        Triangulo triangulo = new Triangulo("Laranja", 2.0, 2.0, 2.0);
        System.out.println("Triângulo - Tipo: " + triangulo.tipoTriangulo());
    }
}