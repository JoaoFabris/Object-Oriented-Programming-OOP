public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("=== TESTE DE POLIMORFISMO - CALCULADORA ===");
        
        // Testando soma
        System.out.println("\n--- SOMA ---");
        calc.mostrarOperacao("Soma", 5, 3);
        System.out.println("Resultado: " + calc.somar(5, 3));
        
        calc.mostrarOperacao("Soma", 5.5, 3.2);
        System.out.println("Resultado: " + calc.somar(5.5, 3.2));
        
        calc.mostrarOperacao("Soma", 1, 2, 3);
        System.out.println("Resultado: " + calc.somar(1, 2, 3));
        
        // Testando subtração
        System.out.println("\n--- SUBTRAÇÃO ---");
        calc.mostrarOperacao("Subtração", 10, 4);
        System.out.println("Resultado: " + calc.subtrair(10, 4));
        
        calc.mostrarOperacao("Subtração", 10.5, 4.2);
        System.out.println("Resultado: " + calc.subtrair(10.5, 4.2));
        
        // Testando multiplicação
        System.out.println("\n--- MULTIPLICAÇÃO ---");
        calc.mostrarOperacao("Multiplicação", 6, 7);
        System.out.println("Resultado: " + calc.multiplicar(6, 7));
        
        calc.mostrarOperacao("Multiplicação", 2.5, 4.0);
        System.out.println("Resultado: " + calc.multiplicar(2.5, 4.0));
        
        calc.mostrarOperacao("Multiplicação", 2, 3, 4);
        System.out.println("Resultado: " + calc.multiplicar(2, 3, 4));
        
        // Testando divisão
        System.out.println("\n--- DIVISÃO ---");
        calc.mostrarOperacao("Divisão", 15, 3);
        System.out.println("Resultado: " + calc.dividir(15, 3));
        
        calc.mostrarOperacao("Divisão", 15.6, 3.2);
        System.out.println("Resultado: " + calc.dividir(15.6, 3.2));
        
        // Testando divisão por zero
        calc.mostrarOperacao("Divisão", 10, 0);
        System.out.println("Resultado: " + calc.dividir(10, 0));
        
        // Testando potenciação
        System.out.println("\n--- POTENCIAÇÃO ---");
        calc.mostrarOperacao("Potenciação", 2, 3);
        System.out.println("Resultado: " + calc.potencia(2, 3));
        
        calc.mostrarOperacao("Potenciação", 2.5, 2);
        System.out.println("Resultado: " + calc.potencia(2.5, 2));
    }
}