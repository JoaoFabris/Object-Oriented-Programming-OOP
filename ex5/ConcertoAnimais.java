public class ConcertoAnimais {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero("Simba", "Leão", 5, 180.0, "Curto", 110);
        Mamifero cachorro = new Mamifero("Rex", "Cachorro", 3, 25.0, "Médio", 63);
        Mamifero gato = new Mamifero("Mimi", "Gato", 2, 4.5, "Longo", 65);
        
        Ave aguia = new Ave("Zeus", "Águia", 4, 6.2, 2.3, "Planado");
        Ave papagaio = new Ave("Louro", "Papagaio", 8, 1.2, 0.8, "Batido");
        Ave galinha = new Ave("Galinha", "Galinha", 2, 2.0, 0.7, "Curto");
        
        Peixe golfinho = new Peixe("Flipper", "Golfinho", 12, 150.0, "Salgada", 200);
        Peixe tubarao = new Peixe("Bruce", "Tubarão Branco", 8, 680.0, "Salgada", 250);
        Peixe nemo = new Peixe("Nemo", "Peixe-Palhaço", 1, 0.03, "Salgada", 30);
        

        Animal[] animais = {leao, cachorro, gato, aguia, papagaio, galinha, 
                           golfinho, tubarao, nemo};
        
        System.out.println(" CONCERTO DOS SONS DOS ANIMAIS ");
        System.out.println("=" .repeat(50));
        

        for (int i = 0; i < animais.length; i++) {
            System.out.println("\n Animal " + (i + 1) + ":");
            System.out.println(" " + animais[i].toString());
            System.out.print("Som: ");
            animais[i].emitirSom();
            System.out.println("-".repeat(40));
        }
        
        System.out.println("\n SHOW ESPECIAL - IDENTIFICAÇÃO POR SONS:");
        System.out.println("=" .repeat(45));
        System.out.println(" Desafio: Identifique os animais apenas pelos sons!\n");
        
        Animal[] animaisEmbaralhados = {papagaio, leao, gato, golfinho, galinha};
        
        for (int i = 0; i < animaisEmbaralhados.length; i++) {
            System.out.print(" Som " + (i + 1) + ": ");
            animaisEmbaralhados[i].emitirSom();
        }
        
        System.out.println("\n RESPOSTAS:");
        for (int i = 0; i < animaisEmbaralhados.length; i++) {
            System.out.println(" Som " + (i + 1) + ": " + 
                             animaisEmbaralhados[i].getNome() + 
                             " (" + animaisEmbaralhados[i].getEspecie() + ")");
        }
        
        System.out.println("\nDEMONSTRAÇÃO DE COMPORTAMENTOS:");
        System.out.println("=" .repeat(35));
        leao.amamentar();
        aguia.voar();
        golfinho.nadar();
        
        System.out.println("\n Hora do descanso:");
        for (Animal animal : animais) {
            if (animal.getNome().equals("Simba") || 
                animal.getNome().equals("Mimi") || 
                animal.getNome().equals("Flipper")) {
                animal.dormir();
            }
        }
    }
}