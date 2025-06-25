public class Calculadora {
    
    // Soma com inteiros
    public int somar(int a, int b) {
        return a + b;
    }
    
    // Soma com decimais
    public double somar(double a, double b) {
        return a + b;
    }
    
    // Soma com três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Soma com três decimais
    public double somar(double a, double b, double c) {
        return a + b + c;
    }
    
    // Subtração com inteiros
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    // Subtração com decimais
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    // Multiplicação com inteiros
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    // Multiplicação com decimais
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Multiplicação com três inteiros
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
    
    // Divisão com inteiros (retorna double para evitar perda de precisão)
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return (double) a / b;
    }
    
    // Divisão com decimais
    public double dividir(double a, double b) {
        if (b == 0.0) {
            System.out.println("Erro: Divisão por zero!");
            return 0.0;
        }
        return a / b;
    }
    
    // Potenciação com inteiros
    public int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    // Potenciação com decimais
    public double potencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
    
    // Método para mostrar qual versão foi chamada
    public void mostrarOperacao(String operacao, Object... valores) {
        System.out.print(operacao + " com valores: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            if (i < valores.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}