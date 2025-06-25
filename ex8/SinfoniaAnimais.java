import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinfoniaAnimais {
    public static void main(String[] args) {
        // Criando lista de animais
        List<Animal> zoologico = new ArrayList<>();
        
        // Adicionando mamíferos
        zoologico.add(new Mamifero("Simba", "Leão", 5, 180.0, "Curto", 110));
        zoologico.add(new Mamifero("Rex", "Cão", 3, 25.0, "Médio", 63));
        zoologico.add(new Mamifero("Mimi", "Gato", 2, 4.5, "Longo", 65));
        zoologico.add(new Mamifero("Bessie", "Vaca", 4, 450.0, "Curto", 280));
        zoologico.add(new Mamifero("Spirit", "Cavalo", 6, 500.0, "Curto", 340));
        
        // Adicionando aves
        zoologico.add(new Ave("Zeus", "Águia", 4, 4.5, 2.3, "Planado"));
        zoologico.add(new Ave("Loro", "Papagaio", 2, 0.8, 0.5, "Batido"));
        zoologico.add(new Ave("Galinha", "Galinha", 1, 2.0, 0.7, "Curto"));
        zoologico.add(new Ave("Piu", "Canário", 1, 0.02, 0.2, "Rápido"));
        zoologico.add(new Ave("Corujão", "Coruja", 3, 1.5, 1.0, "Silencioso"));
        
        // Adicionando peixes
        zoologico.add(new Peixe("Flipper", "Golfinho", 8, 150.0, "Salgada", 200));
        zoologico.add(new Peixe("Willy", "Baleia", 15, 30000.0, "Salgada", 500));
        zoologico.add(new Peixe("Nemo", "Peixe-Palhaço", 1, 0.03, "Salgada", 30));
        zoologico.add(new Peixe("Bruce", "Tubarão", 10, 680.0, "Salgada", 250));
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    sinfoniaCompleta(zoologico);
                    break;
                case 2:
                    sinfoniaPorTipo(zoologico);
                    break;
                case 3:
                    reconhecimentoAuditivo(zoologico);
                    break;
                case 4:
                    catalogoCompleto(zoologico);
                    break;
                case 5:
                    estatisticasZoologico(zoologico);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema de reconhecimento auditivo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    public static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE RECONHECIMENTO AUDITIVO DE ANIMAIS ===");
        System.out.println("Para Equipe de Biólogos");
        System.out.println("======================================================");
        System.out.println("1. Sinfonia Completa (Todos os animais)");
        System.out.println("2. Sinfonia por Tipo (Mamíferos, Aves, Peixes)");
        System.out.println("3. Teste de Reconhecimento Auditivo");
        System.out.println("4. Catálogo Completo de Espécies");
        System.out.println("5. Estatísticas do Zoológico");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void sinfoniaCompleta(List<Animal> animais) {
        System.out.println("\n=== SINFONIA COMPLETA DA NATUREZA ===");
        System.out.println("Reproduzindo sons de todos os " + animais.size() + " animais:");
        System.out.println("=" .repeat(50));
        
        for (int i = 0; i < animais.size(); i++) {
            System.out.print((i + 1) + ". ");
            animais.get(i).emitirSom();
            
            // Pausa dramática entre os sons
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.println("\nSinfonia concluída! Que bela harmonia da natureza!");
    }
    
    public static void sinfoniaPorTipo(List<Animal> animais) {
        System.out.println("\n=== SINFONIA POR CATEGORIA ===");
        
        // Mamíferos
        System.out.println("\n--- MAMÍFEROS ---");
        for (Animal animal : animais) {
            if (animal instanceof Mamifero) {
                animal.emitirSom();
            }
        }
        
        // Aves
        System.out.println("\n--- AVES ---");
        for (Animal animal : animais) {
            if (animal instanceof Ave) {
                animal.emitirSom();
            }
        }
        
        // Peixes
        System.out.println("\n--- PEIXES ---");
        for (Animal animal : animais) {
            if (animal instanceof Peixe) {
                animal.emitirSom();
            }
        }
    }
    
    public static void reconhecimentoAuditivo(List<Animal> animais) {
        System.out.println("\n=== TESTE DE RECONHECIMENTO AUDITIVO ===");
        System.out.println("Identifique os animais pelos sons:");
        System.out.println("=" .repeat(40));
        
        // Selecionando alguns animais para o teste
        Animal[] animaisTeste = {
            animais.get(0), // Leão
            animais.get(6), // Papagaio
            animais.get(2), // Gato
            animais.get(10), // Golfinho
            animais.get(7)  // Galinha
        };
        
        for (int i = 0; i < animaisTeste.length; i++) {
            System.out.println("\nSom " + (i + 1) + ":");
            animaisTeste[i].emitirSom();
        }
        
        System.out.println("\n=== RESPOSTAS ===");
        for (int i = 0; i < animaisTeste.length; i++) {
            System.out.println("Som " + (i + 1) + ": " + 
                             animaisTeste[i].getNome() + 
                             " (" + animaisTeste[i].getEspecie() + ")");
        }
    }
    
    public static void catalogoCompleto(List<Animal> animais) {
        System.out.println("\n=== CATÁLOGO COMPLETO DE ESPÉCIES ===");
        System.out.println("Total de animais catalogados: " + animais.size());
        System.out.println("=" .repeat(60));
        
        for (int i = 0; i < animais.size(); i++) {
            Animal animal = animais.get(i);
            System.out.println("\n" + (i + 1) + ". " + animal.toString());
            System.out.print("   Som característico: ");
            animal.emitirSom();
            
            // Informações específicas por tipo
            if (animal instanceof Mamifero) {
                Mamifero mamifero = (Mamifero) animal;
                System.out.println("   Tipo de pelo: " + mamifero.getTipoPelo());
                System.out.println("   Gestação: " + mamifero.getTempoGestacao() + " dias");
            } else if (animal instanceof Ave) {
                Ave ave = (Ave) animal;
                System.out.println("   Envergadura: " + ave.getEnvergaduraAsas() + "m");
                System.out.println("   Tipo de voo: " + ave.getTipoVoo());
            } else if (animal instanceof Peixe) {
                Peixe peixe = (Peixe) animal;
                System.out.println("   Tipo de água: " + peixe.getTipoAgua());
                System.out.println("   Profundidade máxima: " + peixe.getProfundidadeMaxima() + "m");
            }
        }
    }
    
    public static void estatisticasZoologico(List<Animal> animais) {
        System.out.println("\n=== ESTATÍSTICAS DO ZOOLÓGICO ===");
        
        int mamiferos = 0, aves = 0, peixes = 0;
        double pesoTotal = 0;
        int idadeTotal = 0;
        
        for (Animal animal : animais) {
            if (animal instanceof Mamifero) {
                mamiferos++;
            } else if (animal instanceof Ave) {
                aves++;
            } else if (animal instanceof Peixe) {
                peixes++;
            }
            
            pesoTotal += animal.getPeso();
            idadeTotal += animal.getIdade();
        }
        
        System.out.println("Total de animais: " + animais.size());
        System.out.println("Mamíferos: " + mamiferos + " (" + 
                          String.format("%.1f", (mamiferos * 100.0 / animais.size())) + "%)");
        System.out.println("Aves: " + aves + " (" + 
                          String.format("%.1f", (aves * 100.0 / animais.size())) + "%)");
        System.out.println("Peixes: " + peixes + " (" + 
                          String.format("%.1f", (peixes * 100.0 / animais.size())) + "%)");
        
        System.out.println("\nPeso total: " + String.format("%.2f", pesoTotal) + " kg");
        System.out.println("Peso médio: " + String.format("%.2f", pesoTotal / animais.size()) + " kg");
        System.out.println("Idade média: " + String.format("%.1f", idadeTotal / (double) animais.size()) + " anos");
        
        Animal maisPesado = animais.get(0);
        Animal maisLeve = animais.get(0);
        
        for (Animal animal : animais) {
            if (animal.getPeso() > maisPesado.getPeso()) {
                maisPesado = animal;
            }
            if (animal.getPeso() < maisLeve.getPeso()) {
                maisLeve = animal;
            }
        }
        
        System.out.println("\nAnimal mais pesado: " + maisPesado.getNome() + 
                          " (" + maisPesado.getPeso() + " kg)");
        System.out.println("Animal mais leve: " + maisLeve.getNome() + 
                          " (" + maisLeve.getPeso() + " kg)");
    }
}