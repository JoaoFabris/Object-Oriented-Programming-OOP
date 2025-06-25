public class CatalogoAnimais {
    public static void main(String[] args) {
        // Criando diferentes animais
        Mamifero leao = new Mamifero("Simba", "Leão", 5, 180.0, "Curto", 110);
        Ave aguia = new Ave("Zeus", "Águia", 3, 4.5, 2.3, "Planado");
        Peixe tubarao = new Peixe("Bruce", "Tubarão Branco", 8, 680.0, "Salgada", 250);
        
        System.out.println("=== CATÁLOGO DE ANIMAIS ===");
        System.out.println(leao);
        System.out.println(aguia);
        System.out.println(tubarao);
        System.out.println();
        
        System.out.println("=== COMPORTAMENTOS ESPECÍFICOS ===");
        leao.amamentar();
        leao.regularTemperaturaCorporal();
        System.out.println();
        
        aguia.voar();
        aguia.botarOvos();
        System.out.println();
        
        tubarao.nadar();
        tubarao.respirarPelasGuelras();
        System.out.println();
        
        System.out.println("=== COMPORTAMENTOS COMUNS ===");
        leao.dormir();
        aguia.comer();
        tubarao.dormir();
    }
}